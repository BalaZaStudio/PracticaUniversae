package proyectouniversae.JSON;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonManager {

    private static JsonManager jsonManager;
    private final Grados grados;

    // Constructor privado que recibe un objeto Grados
    private JsonManager(Grados grados) {
        this.grados = grados;
    }

    // Método estático para obtener una instancia única de JsonManager
    public static JsonManager getInstance(String filePath) {
        // Verifica si la instancia es nula
        if (jsonManager == null) {
            jsonManager = loadJsonFromFile(filePath); // Carga el archivo JSON
        }
        return jsonManager;
    }

    // Método privado para cargar el archivo JSON y construir un JsonManager
    private static JsonManager loadJsonFromFile(String filePath) {
        Gson gson = new Gson(); // Crea un objeto Gson para parsear JSON
        try (FileReader reader = new FileReader(filePath)) { // Abre el archivo JSON
            Grados grados = gson.fromJson(reader, Grados.class); // Convierte el JSON en objeto Grados
            return new JsonManager(grados); // Retorna un nuevo JsonManager con los grados cargados
        } catch (IOException e) { // Captura cualquier excepción de E/S
            return null; // Retorna nulo si hay un error al cargar el archivo
        }
    }

    // Método para obtener el texto asociado a un evento específico
    public String getText(String eventId) {
        return grados.texts.get(eventId); // Obtiene el texto del evento del mapa de textos
    }

    // Método para obtener la descripción de un juego dado los índices de grado y juego
    public String getDescripcion(int indexGrado, int indexJuego) {
        return grados.grados.get(indexGrado).juegos.get(indexJuego).descripcion;
    }

    // Método para obtener la ruta de la imagen de un juego dado los índices de grado y juego
    public String getRutaImagen(int indexGrado, int indexJuego) {
        return grados.grados.get(indexGrado).juegos.get(indexJuego).imagen;
    }

    // Método para obtener el título de un juego dado los índices de grado y juego
    public String getTituloJuego(int indexGrado, int indexJuego) {
        return grados.grados.get(indexGrado).juegos.get(indexJuego).titulo;
    }

    // Clase que representa la estructura de datos de los grados disponibles
    private static class Grados {

        // Lista de objetos Grado
        private List<Grado> grados;
        // Mapa de textos adicionales relacionados con los grados
        private Map<String, String> texts;

        // Método para obtener la lista de grados
        public List<Grado> getGrados() {
            return grados;
        }

        // Método para obtener el mapa de textos
        public Map<String, String> getTexts() {
            return texts;
        }
    }

    // Clase que representa un grado específico
    private static class Grado {

        // Nombre del grado
        private String nombre;
        // Lista de juegos asociados al grado
        private List<Juego> juegos;

        // Método para obtener el nombre del grado
        public String getNombre() {
            return nombre;
        }

        // Método para obtener la lista de juegos del grado
        public List<Juego> getJuegos() {
            return juegos;
        }
    }

    // Clase que representa un juego específico
    private static class Juego {

        // Título del juego
        private String titulo;
        // Nombre de la imagen asociada al juego
        private String imagen;
        // Ruta del juego
        private String ruta;
        // Descripción del juego
        private String descripcion;

        // Método para obtener el título del juego
        public String getTitulo() {
            return titulo;
        }

        // Método para obtener el nombre de la imagen del juego
        public String getImagen() {
            return imagen;
        }

        // Método para obtener la ruta del juego
        public String getRuta() {
            return ruta;
        }

        // Método para obtener la descripción del juego
        public String getDescripcion() {
            return descripcion;
        }
    }
}
