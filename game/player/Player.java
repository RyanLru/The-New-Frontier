/*package game.player;

import game.items.Item;

import java.util.ArrayList;

public class Player {
    private int x; //position x du joueur sur la carte
    private int y; //position y du joueur sur la carte
    private int inventorySize; //taille de l'inventaire du joueur
    private ArrayList<Item> inventory; //liste des objets dans l'inventaire du joueur

    public Player(int x, int y, int inventorySize) {
        this.x = x;
        this.y = y;
        this.inventorySize = inventorySize;
        this.inventory = new ArrayList<Item>();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getInventorySize() {
        return inventorySize;
    }

    public void setInventorySize(int inventorySize) {
        this.inventorySize = inventorySize;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public boolean addItem(Item item) {
        if (inventory.size() < inventorySize) {
            inventory.add(item);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeItem(Item item) {
        return inventory.remove(item);
    }

    public boolean hasItem(Item item) {
        return inventory.contains(item);
    }

    public boolean isInventoryFull() {
        return inventory.size

                () == inventorySize;
    }
}
*/