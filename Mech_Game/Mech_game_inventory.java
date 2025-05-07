package Mech_Game;

public class Mech_game_inventory {
    private int quantity;
    private int maxQuantity;
    boolean isFull;

//    private final ArrayList<itemBase> items;

    public int getQuantity() { return quantity; }
    public int getMaxQuantity() { return maxQuantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }
    public void setMaxQuantity(int maxQuantity) { this.maxQuantity = maxQuantity; }

    private void isFull() {
        if (getQuantity() <= getMaxQuantity()) {
            isFull = false;
        } else {
            isFull = true;
        }
    }

    public void addItem() {
        if (getQuantity() >= getMaxQuantity()) return;


    }
}
