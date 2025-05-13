package Fountain_of_items;

import java.util.Scanner;

public class Fountain_of_items {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("How large do you want the cave to be(small, medium, big)? ");
        int size = switch (input.nextLine().toLowerCase()) {
            case "medium" -> 6;
            case "big" -> 8;
            default -> 4;
        };

        Dungeon dungeon = new Dungeon(size);
        Player player = new Player();
//        Pit pit = new Pit(2, 1);//temporary

        System.out.println("You have entered a cave in search of the mythical fountain of items and activate it again after its long dormant state"); //make this magenta
        boolean quitting = false;
        while (!quitting) {
            dungeon.preAct(player);
            quitting = player.act(dungeon, input);

            dungeon.postAct(player);
        }
    }
}