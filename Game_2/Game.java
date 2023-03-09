package Game_2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Game extends JPanel {
    private BufferedImage mapImage;

    public Game() {
        JFrame frame = new JFrame("Jeu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(this);
        frame.setVisible(true);

        Map map = new Map(800, 600);
        mapImage = map.generateMap();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(mapImage, 0, 0, null);
    }
}
