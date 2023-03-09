package game.terrain;

import java.util.Random;
import Resource;


public class MapGenerator {
    private final int width;
    private final int height;

    public MapGenerator(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public GameMap generateMap() { //createMap a la base changer en generateMap
        GameMap map = new GameMap(width, height);

        Random random = new Random();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                MapTile tile = map.getTile(x, y);

                // Add rocks
                int rockChance = random.nextInt(100);
                if (rockChance < 10) {
                    int rockAmount = random.nextInt(50) + 1;
                    tile.addResource(Resource.ROCK, rockAmount);
                }

                // Add trees
                int treeChance = random.nextInt(100);
                if (treeChance < 30) {
                    tile.addResource(Resource.TREE, 1);
                }
            }
        }

        return map;
    }
}



