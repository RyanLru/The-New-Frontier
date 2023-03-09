package game.terrain;

package game.terrain;

public class Tile {
    private final TileType type;
    private int durability;

    public Tile(TileType type) {
        this.type = type;
        this.durability = type.getDurability();
    }

    public TileType getType() {
        return type;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
}
