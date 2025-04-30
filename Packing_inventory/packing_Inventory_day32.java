package Packing_inventory;

import java.util.ArrayList;
import java.util.List;

import Utilities.User_input;

public class packing_Inventory_day32 {
    public static void main(String[] args) {
        Pack pack = new Pack(10, 10, 10);
        boolean quit = false;

        while (!quit) {
            System.out.println("--------");
            System.out.println("what do you want to do? ");
            System.out.println("add to inventory (1)");
            System.out.println("look at inventory (2)");
            System.out.println("quit (3)");

            int choice = User_input.AskForNumberInRange("make your choice: ", 1, 3);

            switch(choice) {
                case 1:
                    System.out.println("--------");
                    System.out.println("Arrow(1)");
                    System.out.println("Bow(2)");
                    System.out.println("Rope(2)");
                    System.out.println("Water(3)");
                    System.out.println("Food rations(4)");
                    System.out.println("Sword(5)");
                    int addItem = User_input.AskForNumberInRange("what do you want to add? ", 1, 6);
                    switch (addItem) {
                        case 1:
                            pack.add(new arrow()); break;
                        case 2:
                            pack.add(new bow()); break;
                        case 3:
                            pack.add(new rope()); break;
                        case 4:
                            pack.add(new water()); break;
                        case 5:
                            pack.add(new food_rations()); break;
                        case 6:
                            pack.add(new sword()); break;
                    }
                    break;
                case 2:
                    pack.printCount();
                    System.out.println("--------");
                    pack.stats(); break;
                case 3:
                    System.out.println("goodbye");
                    quit = true;
            }
        }


    }

}
