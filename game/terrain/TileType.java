package game.terrain;

public class TileType {
    private final String name;
    private final int textureIndex;

    public TileType(String name, int textureIndex) {
        this.name = name;
        this.textureIndex = textureIndex;
    }

    public String getName() {
        return name;
    }

    public int getTextureIndex() {
        return textureIndex;
    }

    public int getDurability() {
    }
}
