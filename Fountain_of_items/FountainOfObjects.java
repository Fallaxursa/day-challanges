package Fountain_of_items;

import java.util.Scanner;

public class FountainOfObjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player player = new Player();
        Dungeon dungeon = new Dungeon(player.roomSize(input));
        dungeon.start(input);
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