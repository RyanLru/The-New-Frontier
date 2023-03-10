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

        Noise noise = new Noise(1542665L);
        noiseMap = new double[width][height];
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                double noiseValue = noise.noise(x / 100.0, y / 100.0, 0);
                noiseMap[x][y] = noiseValue;
            }
        }
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