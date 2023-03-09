package Game_2;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Map {
    private int width;
    private int height;
    private double[][] noiseMap;


    public Map(int width, int height) {
        this.width = width;
        this.height = height;

        Noise noise = new Noise();
        noiseMap = noise.generatePerlinNoise(width, height, 8, 0.5, 2);
    }

    public BufferedImage generateMap() {
        BufferedImage mapImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int colorValue = (int) (noiseMap[x][y] * 255);
                int color = new Color(colorValue, colorValue, colorValue).getRGB();
                mapImage.setRGB(x, y, color);
            }
        }

        return mapImage;
    }
}
