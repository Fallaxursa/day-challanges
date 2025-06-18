package inventorySystem;

import inventorySystem.items.ItemBase;
import inventorySystem.items.Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
    Scanner input = new Scanner(System.in);
    ArrayList<ItemBase> items;

    public Inventory() {
        items = new ArrayList<ItemBase>();
    }

    public void loop() {

        while (true) {
            int choice = Inventory.askChoice(input);
            switch (choice) {
                case 1 -> addHandler();
//                case 2 -> remove();
                case 3 -> printAddMenu();
            }
        }
    }

    public static int askChoice(Scanner input) {
        System.out.print("what do you want to do [1] Add [2] Remove [3] Check [4] Quit: ");
        int choice = input.nextInt();
        return choice;
    }

    public void addHandler() {
        System.out.println("Possible items: ");

        String selectedItem = input.nextLine().trim().toUpperCase();
        if (selectedItem.equals(Items.DIAMOND)) {

        }

    }

    public void add(ItemBase item) {
        items.add(item);
    }

    public void remove(ItemBase item) {
        items.remove(item);
    }

    public void printAddMenu() {
        for (ItemBase item : items) {
            System.out.println(item);
        }
    }

    public boolean hasItem(ItemBase item) {
        if (items.contains(item)) {
            return true;
        } else {
            return false;
        }
    }
}
