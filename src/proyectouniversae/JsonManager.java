package proyectouniversae;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class JsonManager {

    private static JsonManager jsonManager;
    private Texts texts;

    private JsonManager(Texts texts) {
        this.texts = texts;
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
            Texts texts = gson.fromJson(reader, Texts.class);
            return new JsonManager(texts);
        } catch (IOException e) {
            return null;
        }
    }

    public String getText(String eventId) {
        return texts.texts.get(eventId);
    }

    private static class Texts {

        private Map<String, String> texts;

        public Map<String, String> getTexts() {
            return texts;
        }
    }
}
