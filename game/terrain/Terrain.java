/*package game.terrain;

import java.util.Random;

public class Terrain {
    private final int width;
    private final int height;
    private final Tile[][] tiles;

    public Terrain(int width, int height) {
        this.width = width;
        this.height = height;
        this.tiles = new Tile[width][height];
    }

    public void generate() {
        Random random = new Random();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                // Génère un terrain aléatoire
                if (random.nextFloat() < 0.5f) {
                    tiles[x][y] = new Tile(TileType.GRASS);
                } else {
                    tiles[x][y] = new Tile(TileType.DIRT);
                }
            }
        }
    }

    public Tile getTile(int x, int y) {
        if (x < 0 || x >= width || y < 0 || y >= height) {
            return null;
        }
        return tiles[x][y];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
*/