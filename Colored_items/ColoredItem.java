package Colored_items;

public class ColoredItem<T> {
    private T item;
    private ConsoleColor color;

    public ColoredItem(T item, ConsoleColor color) {
        this.item = item;
        this.color = color;
    }

    public void display() {
        System.out.println("Item: " + item + ", color: " + color + ConsoleColor.RESET.getCode());
    }
}
