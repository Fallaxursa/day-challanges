package Colored_items;

public class Colored_items_day38 {
    public static void main(String[] args) {
        Sword sword = new Sword();
        Bow bow = new Bow();
        Axe axe = new Axe();

        ColoredItem<Sword> coloredSword = new ColoredItem<>(sword, ConsoleColor.RED);
        ColoredItem<Bow> coloredBow = new ColoredItem<>(bow, ConsoleColor.BLUE);
        ColoredItem<Axe> coloredAxe = new ColoredItem<>(axe, ConsoleColor.GREEN);

        coloredSword.display();
        coloredBow.display();
        coloredAxe.display();
    }
}
