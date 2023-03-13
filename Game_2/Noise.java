import jnoise.JNoise;
import jnoise.modules.*;

public class PerlinNoise {

    private Module module;

    public PerlinNoise(long seed) {
        // Créer le générateur de bruit de Perlin avec une permutation aléatoire basée sur la graine donnée
        this.module = new Noise();
        this.module.setSeed(seed);
        this.module.setModule(new Perlin());
    }

    public double noise(double x, double y, double z) {
        // Obtenir la valeur de bruit de Perlin pour les coordonnées x, y, z
        return this.module.getValue(x, y, z);
    }
}
