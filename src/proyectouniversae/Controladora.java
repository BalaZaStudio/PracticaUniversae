package proyectouniversae;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import proyectouniversae.JSON.JsonManager;
import static proyectouniversae.PantallaGame.jLabelTitulo;
import static proyectouniversae.PantallaGame.jTextParrafo;
import static proyectouniversae.PantallaGame.listaImagenesCargadas;
import static proyectouniversae.PantallaPrincipal.imagenActualIndex;

/**
 *
 * @author zabadev
 */
public class Controladora {

    //Lista de listas de imágenes
    private static final List<List<ImageIcon>> imagenesList = new ArrayList<>();

    public static void cargarImagenes(List<ImageIcon> listaImagenes, String carpeta, String[] nombresArchivos) {
        for (String nombreArchivo : nombresArchivos) {
            ImageIcon imagen = new ImageIcon("C:/Users/zabal/Documents/GitHub/PracticaUniversae/src/proyectouniversae/InterfazGame/Miniaturas/" + carpeta + "/" + nombreArchivo);
            listaImagenes.add(imagen);
        }
    }

    public static void inicializarCargaImagenes(List<ImageIcon> listaImagenes) {
        String[] nombresHelicoptero = {"Helicoptero0.png", "Helicoptero1.png", "Helicoptero2.png", "Helicoptero3.png", "Helicoptero4.png"};
        String[] nombresHemorragia = {"Hemorragia0.png", "Hemorragia1.png", "Hemorragia2.png", "Hemorragia3.png", "Hemorragia4.png"};
        String[] nombresExtincion = {"Extincion0.png", "Extincion1.png", "Extincion2.png", "Extincion3.png", "Extincion4.png"};
        String[] nombresEPIS = {"EPIS0.png", "EPIS1.png", "EPIS2.png", "EPIS3.png", "EPIS4.png"};
        String[] nombresHelicoptero1 = {"Helicoptero0.png", "Helicoptero1.png", "Helicoptero2.png", "Helicoptero3.png", "Helicoptero4.png"};
        String[] nombresAscensor = {"Ascensor0.png", "Ascensor1.png", "Ascensor2.png", "Ascensor3.png", "Ascensor4.png"};

        cargarImagenes(PantallaGame.imagenes, "Helicoptero", nombresHelicoptero);
        cargarImagenes(PantallaGame.imagenes1, "Hemorragia", nombresHemorragia);
        cargarImagenes(PantallaGame.imagenes2, "Extincion", nombresExtincion);
        cargarImagenes(PantallaGame.imagenes3, "EPIS", nombresEPIS);
        cargarImagenes(PantallaGame.imagenes4, "Helicoptero", nombresHelicoptero1);
        cargarImagenes(PantallaGame.imagenes5, "Ascensor", nombresAscensor);

// La lista listaImagenesCargadas se asigna dependiendo de si listaImagenes está vacía o no.
// Si listaImagenes no está vacía, listaImagenesCargadas se establece como igual a listaImagenes.
// De lo contrario, se crea una nueva ArrayList vacía y se asigna a listaImagenesCargadas.
        PantallaGame.listaImagenesCargadas = !listaImagenes.isEmpty() ? listaImagenes : new ArrayList<>();
    }

    public static void mostrarPrimeraImagenEnPanel() {
        // Verifica si la lista de imágenes cargadas no está vacía.
        if (!listaImagenesCargadas.isEmpty()) {
            mostrarImagenActualEnPanel(listaImagenesCargadas);
        }
    }

    public static void mostrarImagenActualEnPanel(List<ImageIcon> listaImagenes) {
        if (!listaImagenes.isEmpty()) {
            ImageIcon imagenOriginal = listaImagenes.get(PantallaPrincipal.imagenActualIndex);

            // Especificar el tamaño deseado para la imagen
            int anchoDeseado = 700;
            int altoDeseado = 550;

            // Redimensionar la imagen al tamaño deseado
            Image imagenRedimensionada = imagenOriginal.getImage().getScaledInstance(anchoDeseado, altoDeseado, Image.SCALE_SMOOTH);

            // Crear un nuevo ImageIcon con la imagen redimensionada
            ImageIcon imagenEscalada = new ImageIcon(imagenRedimensionada);

            // Mostrar la imagen redimensionada en el JLabel
            PantallaGame.jLabelContent.setIcon(imagenEscalada);
            actualizarCirculos(imagenActualIndex);

        }
    }

    public static void escalarImagen(JLabel label, int width, int height) {
        ImageIcon icon = (ImageIcon) label.getIcon();
        if (icon != null) {
            Image currentImage = icon.getImage();
            Image scaledImage = currentImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            label.setIcon(new ImageIcon(scaledImage));
        }
    }

    public static void reproducirSonidoYMostrarImagenes(List<ImageIcon> imagenes) throws JavaLayerException {

        reproducirSonido("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\Sounds\\Click.mp3");
        resetImagenActualIndex();
        new PantallaGame().setVisible(true);
        inicializarCargaImagenes(imagenes);
        mostrarPrimeraImagenEnPanel();

    }

    public static void reproducirSonido(String rutaArchivo) throws JavaLayerException {
        try {
            // Crea un flujo de entrada para el archivo MP3
            FileInputStream entradaMp3 = new FileInputStream(rutaArchivo);

            // Crea un objeto Player para reproducir el archivo MP3
            Player player = new Player(entradaMp3);

            // Reproduce el sonido
            player.play();
        } catch (FileNotFoundException e) {
            // Manejo de excepciones
            System.err.println("Archivo no encontrado: " + e.getMessage());
        }
    }

    public static void updateTextTitulo(int indexGrado, int indexJuego) {
        JsonManager jsonManager = JsonManager.getInstance("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\JSON\\Dialogo.json");
        String titulo = jsonManager.getTituloJuego(indexGrado, indexJuego);
        jLabelTitulo.setText(titulo);
    }

    public static void updateTextParrafo(int indexGrado, int indexJuego) {
        JsonManager jsonManager = JsonManager.getInstance("C:\\Users\\zabal\\Documents\\GitHub\\PracticaUniversae\\src\\proyectouniversae\\JSON\\Dialogo.json");
        String descripcion = jsonManager.getDescripcion(indexGrado, indexJuego);
        jTextParrafo.setText(descripcion);
    }

    public static void resetImagenActualIndex() {
        imagenActualIndex = 0;
    }

    public static void logoReset() {
        // Resetea la variable imagenActualIndex
        Controladora.resetImagenActualIndex();
        // Crea una nueva instancia de PantallaPrincipal
        PantallaPrincipal pantallaPrincipal = new PantallaPrincipal();
        // Muestra la nueva instancia de PantallaPrincipal
        pantallaPrincipal.setVisible(true);
        // Actualiza imagenActualIndex en la nueva instancia de PantallaPrincipal
        PantallaPrincipal.setImagenActualIndex(0); // O cualquier otro valor adecuado
    }

    public static void actualizarCirculos(int indiceImagen) {
        JLabel[] jLabelCircleFills = {PantallaGame.jLabelCircleFill1, PantallaGame.jLabelCircleFill2, PantallaGame.jLabelCircleFill3, PantallaGame.jLabelCircleFill4, PantallaGame.jLabelCircleFill5};

        // Ocultar todos los círculos
        for (JLabel label : jLabelCircleFills) {
            label.setVisible(false);
        }

        // Ajustar el índice al rango válido
        indiceImagen = Math.max(0, Math.min(indiceImagen, jLabelCircleFills.length - 1));

        // Mostrar el círculo correspondiente al índice ajustado
        jLabelCircleFills[indiceImagen].setVisible(true);
    }

}
