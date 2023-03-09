package game.gui.screens;

/*
//package game.gui.screens.ScreenManager;

import game.assets.Assets;
import game.gui.screens.Button;
import game.gui.screens.Screen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuScreen {
    private Button playButton;
    private Button quitButton;

    public MainMenuScreen(ScreenManager screenManager) {
        super(screenManager);
        this.playButton = new Button("Play", 300, 200, 200, 50);
        this.quitButton = new Button("Quit", 300, 300, 200, 50);

        // Ajoute les listeners d'événements pour les boutons
        this.playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenManager.showScreen(GameScreen.class);
            }
        });

        this.quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenManager.close();
            }
        });
    }

    @Override
    public void draw(Graphics g) {
        // Dessine le fond d'écran
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.screenManager.getWindowWidth(), this.screenManager.getWindowHeight());

        // Dessine les boutons
        this.playButton.draw(g);
        this.quitButton.draw(g);
    }

    public void update() {
        // Ne fait rien
    }
}

*/