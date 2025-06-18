package inventorySystem;

import inventorySystem.items.ItemBase;

import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        ItemBase strawberry = new ItemBase("Strawberry",1, "fruit");
        ItemBase stardrop = new ItemBase("stardrop", 1, "fruit");


        inventory.loop();
    }


}
