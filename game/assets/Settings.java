package game.assets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Settings {

    public static int FPS;
    public static String WINDOW_TITLE;

    public static void loadFromFile(String filename) {
        Gson gson = new GsonBuilder().create();
        try (Reader reader = new FileReader(filename)) {
            Settings settings = gson.fromJson(reader, Settings.class);
            FPS = settings.FPS;
            WINDOW_TITLE = settings.WINDOW_TITLE;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}