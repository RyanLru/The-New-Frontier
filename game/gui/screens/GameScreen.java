package game.gui.screens;
package game.gui.screens.Screen;

import game.player.Player;
import game.terrain.Terrain;

import java.awt.*;

public class GameScreen extends Screen {
    private Terrain terrain;
    private Player player;

    public GameScreen(Terrain terrain, Player player) {
        super();
        this.terrain = terrain;
        this.player = player;
    }

    @Override
    public void update() {
        // Met à jour la logique du jeu
        terrain.update();
        player.update();
    }

    @Override
    public void draw(Graphics2D g) {
        // Dessine le contenu du jeu sur l'écran
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());

        terrain.draw(g);
        player.draw(g);
    }
}

