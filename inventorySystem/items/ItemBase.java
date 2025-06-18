package inventorySystem.items;

public class ItemBase {
    private String name;
    private int quantity;
    private String type;

    public ItemBase(String name, int quantity, String type) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }
}
