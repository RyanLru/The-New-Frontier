package game.assets;


import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Sounds {
    private static HashMap<String, Clip> clips = new HashMap<>();

    public static void load() {
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("assets/sound.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clips.put("sound", clip);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    public static void play(String name) {
        Clip clip = clips.get(name);
        clip.setFramePosition(0);
        clip.start();
    }
}

