package Fountain_of_items;

import java.util.Scanner;

public class FountainOfObjects {
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

        System.out.println("You have entered a cave in search of the mythical fountain of items and activate it again after its long dormant state"); //make this magenta
        while (true) {

            dungeon.preAct(player);

            dungeon.printRooms();

            if (player.act(dungeon, input)) {
                // Quitting game
                break;
            }

            if (dungeon.postAct(player)) {
                // Quitting game
                break;
            }
        }

        input.close();
    }
}