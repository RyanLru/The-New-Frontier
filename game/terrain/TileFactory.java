package game.terrain;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TileFactory {
    private static final Map<String, TileType> tileTypes = new HashMap<>();

    public static void loadTileTypes(String filename) {
        try {
            Gson gson = new GsonBuilder().create();
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            JsonObject json = gson.fromJson(reader, JsonObject.class);
            reader.close();

            for (Map.Entry<String, Object> entry : json.entrySet()) {
                String name = entry.getKey();
                TileType tileType = gson.fromJson(entry.getValue().toString(), TileType.class);
                tileTypes.put(name, tileType);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Tile createTile(String type) {
        TileType tileType = tileTypes.get(type);
        if (tileType == null) {
            throw new IllegalArgumentException("Unknown tile type: " + type);
        }
        return new Tile(tileType);
    }
}


