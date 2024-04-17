package proyectouniversae;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class JsonManager {

    private static JsonManager jsonManager;
    private final Grados grados;

    private JsonManager(Grados grados) {
        this.grados = grados;
    }

    public static JsonManager getInstance(String filePath) {
        if (jsonManager == null) {
            jsonManager = loadJsonFromFile(filePath);
        }
        return jsonManager;
    }

    private static JsonManager loadJsonFromFile(String filePath) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(filePath)) {
            Grados grados = gson.fromJson(reader, Grados.class);
            return new JsonManager(grados);
        } catch (IOException e) {
            return null;
        }
    }

    public String getText(String eventId) {
        return grados.texts.get(eventId);
    }

    // Método para obtener la descripción del juego según el índice del grado y del juego
    public String getDescripcion(int indexGrado, int indexJuego) {
        return grados.grados.get(indexGrado).juegos.get(indexJuego).descripcion;
    }

    // Método para obtener la ruta de la imagen del juego según el índice del grado y del juego
    public String getRutaImagen(int indexGrado, int indexJuego) {
        return grados.grados.get(indexGrado).juegos.get(indexJuego).imagen;
    }

    // Método para obtener el título del juego según el índice del grado y del juego
    public String getTituloJuego(int indexGrado, int indexJuego) {
        return grados.grados.get(indexGrado).juegos.get(indexJuego).titulo;
    }

    private static class Grados {

        private List<Grado> grados;
        private Map<String, String> texts;

        public List<Grado> getGrados() {
            return grados;
        }

        public Map<String, String> getTexts() {
            return texts;
        }
    }

    private static class Grado {

        private String nombre;
        private List<Juego> juegos;

        public String getNombre() {
            return nombre;
        }

        public List<Juego> getJuegos() {
            return juegos;
        }
    }

    private static class Juego {

        private String titulo;
        private String imagen;
        private String ruta;
        private String descripcion;

        public String getTitulo() {
            return titulo;
        }

        public String getImagen() {
            return imagen;
        }

        public String getRuta() {
            return ruta;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }
}
