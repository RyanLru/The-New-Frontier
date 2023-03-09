/*package game.gui.screens;


import javax.swing.*;

/**
 * Une classe abstraite représentant un écran du jeu.
 * Chaque écran doit définir une méthode pour mettre à jour sa logique,
 * une méthode pour dessiner son contenu, ainsi que des méthodes pour
 * réagir aux événements utilisateur (clics de souris, touches clavier, etc.).
 *//*
public abstract class Screen extends JPanel {

    private final ScreenManager screenManager;

    /**
     * Initialise un nouvel écran avec le gestionnaire d'écran spécifié.
     * @param screenManager le gestionnaire d'écran du jeu
     *//*
    public Screen(ScreenManager screenManager) {
        this.screenManager = screenManager;
    }

    public Screen() {

        screenManager = null;
    }

    /**
     * Met à jour la logique de l'écran.
     *//*
    public abstract void update();

    /**
     * Dessine le contenu de l'écran.
     *//*
    public abstract void draw();

    /**
     * Réagit à un clic de souris à la position spécifiée.
     * @param x la position en abscisse du clic
     * @param y la position en ordonnée du clic
     *//*
    public abstract void onMouseClick(int x, int y);

    /**
     * Réagit à une touche clavier enfoncée.
     * @param keyCode le code de la touche enfoncée
     *//*
    public abstract void onKeyDown(int keyCode);

    /**
     * Réagit à une touche clavier relâchée.
     * @param keyCode le code de la touche relâchée
     *//*
    public abstract void onKeyUp(int keyCode);

    /**
     * Retourne le gestionnaire d'écran du jeu.
     * @return le gestionnaire d'écran
     *//*
    public ScreenManager getScreenManager() {
        return screenManager;
    }

    public void show(JFrame window) {
    }
}
*/
