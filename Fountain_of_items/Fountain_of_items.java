package Fountain_of_items;

import java.util.Scanner;

public class Fountain_of_items {
    public static void main(String[] args) {
        String[][] room;

        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("how big do you want the cave to be(small, medium, big)? ");
        int size = switch (input.nextLine().toLowerCase()) {//advanced switch for cave size
            case "small" -> 4;
            case "medium" -> 6;
            case "big" -> 8;
            default -> 4; //default :)
        };

        Player player = new Player(size);
        room = new String[size][size];

//        System.out.println(size);//test

        for (int i = 0; i < size; i++) { //makes sure all other rooms are empty
            for (int j = 0; j < size; j++) {
                room[i][j] = "empty";
            }
        }

        int fountainRow = 0, fountainCol = 0;//fountain variables

        switch (size) { //decides where the fountain goes for each size
            case 4 -> { fountainRow = 0; fountainCol = 2; }
            case 6 -> { fountainRow = 3; fountainCol = 5; }
            case 8 -> { fountainRow = 4; fountainCol = 5; }
        }
        Fountain fountain = new Fountain(fountainRow, fountainCol); //instanciates fountain with correct cords
        room[fountainRow][fountainCol] = "Fountain - you hear water dripping in this room. The fountain is here!"; //actually puts the fountain cords into the 2d array
        room[0][0] = "Entrance -  you see the light from outside"; //standard entrance always in 0,0

        System.out.println("You have entered a cave in search of the mythical fountain of items and activate it again after its long dormant state"); //make this magenta

        while(true) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println(STR."You are in the room at (Row=\{player.getPlayerRow()}, Column=\{player.getPlayerCol()})");
            System.out.println(room[player.getPlayerRow()][player.getPlayerCol()]);

            System.out.print("What do you want to do? ");
            String act = input.nextLine();

            switch (act.toLowerCase()) {
                case "north": player.moveNorth(); break;
                case "south": player.moveSouth(); break;
                case "east": player.moveEast(); break;
                case "west": player.moveWest(); break;
                case "activate":
                    if (fountain.isInFountainRoom(fountain.getRow(), fountain.getCol())) {
                        fountain.activateFountain();
                    } else {
                        System.out.println("You're not in the fountain room.");
                    } break;
                case "quit": System.out.println("quiting game..."); return;
                default: System.out.println("please try again"); break;
            }

            if (player.isOnEntrance() && fountain.isFountainOn()) {
                System.out.println("You successfully reactivated the fountain and made your way out!!");
                return;
            }
        }
    }
}