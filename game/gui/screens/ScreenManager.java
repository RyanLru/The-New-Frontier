package game.gui.screens;

package game;

import java.util.HashMap;

import javax.swing.JFrame;

import game.gui.screens.Screen;

public class ScreenManager {

    private JFrame window;
    private HashMap<Class<? extends Screen>, Screen> screens;

    public ScreenManager(JFrame window) {
        this.window = window;
        this.screens = new HashMap<Class<? extends Screen>, Screen>();
    }

    public void addScreen(Screen screen) {
        this.screens.put(screen.getClass(), screen);
    }

    public void showScreen(Class<? extends Screen> screenClass) {
        Screen screen = this.screens.get(screenClass);
        if (screen == null) {
            throw new IllegalArgumentException("No screen found for class: " + screenClass.getName());
        }
        screen.show(this.window);
    }

    public void addScreen(MainMenuScreen mainMenuScreen) {
    }
}

