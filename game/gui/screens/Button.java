package game.gui.screens;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionListener;

public class Button {

    private String label;
    private Rectangle bounds;
    private ActionListener actionListener;

    public Button(String label, int x, int y, int width, int height) {
        this.label = label;
        this.bounds = new Rectangle(x, y, width, height);
    }

    public void addActionListener(ActionListener listener) {
        this.actionListener = listener;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
        g.setColor(Color.BLACK);
        g.drawRect(bounds.x, bounds.y, bounds.width, bounds.height);
        g.setFont(new Font("Arial", Font.PLAIN, 20));
        int labelWidth = g.getFontMetrics().stringWidth(label);
        int labelHeight = g.getFontMetrics().getHeight();
        int labelX = bounds.x + (bounds.width - labelWidth) / 2;
        int labelY = bounds.y + (bounds.height - labelHeight) / 2 + labelHeight - 5;
        g.drawString(label, labelX, labelY);
    }

    public Rectangle getBounds() {
        return bounds;
    }
}

