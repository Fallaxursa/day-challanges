package Fountain_of_items;

import java.util.Scanner;
import java.time.*;

public class FountainOfObjects {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.now();
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


        LocalTime endTime = LocalTime.now();

        Duration elapsedTime = Duration.between(startTime, endTime);

        System.out.println(elapsedTime.toMinutes());
        input.close();
    }
}