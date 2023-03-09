package game.assets;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Assets {
    private static HashMap<String, BufferedImage> images = new HashMap<>();

    public static void load() {
        try {
            images.put("player", ImageIO.read(new File("assets/player.png")));
            images.put("terrain", ImageIO.read(new File("assets/terrain.png")));
            // Ajoutez des images pour d'autres éléments du jeu ici
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage getImage(String name) {
        return images.get(name);
    }
}

