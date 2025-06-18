package Modular_object_test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    Scanner input = new Scanner(System.in);
    Player player = new Player();
    CraftingSystem crafting = new CraftingSystem();

    void start() {
        System.out.println("Game started actions available: ");
        System.out.println(" -slide");
        System.out.println(" -jump");
        System.out.println(" -dash");
        while (true) {
            System.out.println("Current scrap: " + player.getScrap());
            System.out.print("Choose action: ");
            String actions = input.nextLine();
            if (actions.equalsIgnoreCase("quit")) break;

            List<String> moveChain = Arrays.asList(actions.trim().toLowerCase().split( " "));
            Weapon weapon = crafting.craftWeapon(moveChain, player);
            if (weapon != null) {
                player.equipWeapon(weapon);
                System.out.println("Crafted weapon: " + weapon.getName());
                System.out.println("Fire? (yes/no)");
                String fire = input.nextLine();
                if (fire.equalsIgnoreCase("yes")) {
                    player.fireWeapon();
                    int gainedScrap = (int) (weapon.getScrapMultiplier() * 10);
                    player.addScrap(gainedScrap); //kill
                    System.out.println("Enemy killed. gained scrap.");
                } else {
                    System.out.println("Do you want to eat the weapon? (yes/no)");
                    String eat = input.nextLine();
                    if (eat.equalsIgnoreCase("yes")) {
                        player.eatWeapon();
                    }
                }
            } else {
                System.out.println("Crafting failed!");
            }
        }
        System.out.println("Game over");
    }
}