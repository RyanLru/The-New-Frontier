/*package game;

import game.assets.Assets;
import game.assets.Settings;
import game.assets.Sounds;
import game.gui.screens.GameScreen;
import game.gui.screens.MainMenuScreen;
import game.gui.screens.ScreenManager;
import game.player.Inventory;
import game.player.Player;
import game.terrain.Terrain;

import javax.swing.*;

public class Main {
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;

    public static void main(String[] args, Object TileFactory) {
        // Initialise la fenêtre de jeu
        JFrame window = new JFrame("The New Frontiers");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        // Charge les paramètres de configuration du jeu depuis le fichier "settings.json"
        Settings.loadFromFile("assets/settings.json");

        // Initialise les éléments visuels et sonores du jeu
        Assets.load();
        Sounds.load();

        // Initialise la carte de jeu
        //TileFactory.loadTileTypes("assets/tile_types.json");
        Terrain terrain = new Terrain(50, 50);
        terrain.generate();

        // Initialise le joueur
        Player player = new Player(0,0,20);

        // Initialise l'écran principal du jeu
        GameScreen gameScreen = new GameScreen(terrain, player);

        // Initialise le gestionnaire d'écran du jeu
        ScreenManager screenManager = new ScreenManager(window);
        screenManager.addScreen(new MainMenuScreen(screenManager));
        screenManager.addScreen(gameScreen);

        // Affiche l'écran principal du jeu
        screenManager.showScreen(GameScreen.class);

        // Lance la boucle de jeu
        while (true) {
            long startTime = System.nanoTime();

            // Met à jour la logique du jeu
            gameScreen.update();

            // Dessine le contenu du jeu sur l'écran
            gameScreen.draw();

            // Calcul le temps nécessaire pour mettre à jour et dessiner le contenu du jeu
            long elapsedTime = System.nanoTime() - startTime;
            long sleepTime = (long) ((1000000000.0 / Settings.FPS) - elapsedTime);
            if (sleepTime > 0) {
                try {
                    Thread.sleep(sleepTime / 1000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}*/