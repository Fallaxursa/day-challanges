package Fountain_of_items;

import java.util.Scanner;

public class Player {
    private int playerRow = 0;
    private int playerCol = 0;

    public int getCol() { return playerCol; }
    public int getRow() { return playerRow; }

    public void move(Direction direction) {
//        Moves the player without checking if the move is legal
        switch (direction) {
            case NORTH:
                playerRow--;
                break;
            case EAST:
                playerCol++;
                break;
            case SOUTH:
                playerRow++;
                break;
            case WEST:
                playerCol--;
                break;
        }
        System.out.println(STR."Moved to: (\{playerRow}, \{playerCol})");
    }

    boolean act(Dungeon dungeon, Scanner input) {
        System.out.print("What do you want to do? ");

        String act = input.nextLine();
        try {
            Direction chosenDirection = Direction.valueOf(act.toUpperCase());

            if (dungeon.canMove(this, chosenDirection))
                move(chosenDirection);

        } catch (Exception e) {
            // DON'T CARE
        }

        Room currentRoom = dungeon.getCurrentRoom(this);

        if (act.equalsIgnoreCase("activate")) {
            if (currentRoom.getRoomType() == RoomType.FOUNTAIN) {
                Fountain fountainRoom = (Fountain) currentRoom;

                fountainRoom.activate();
            }
        }

        if (act.equalsIgnoreCase("quit")) {
            System.out.println("quiting game...");
            return true;
        }
//            case "activate":
//                if (fountain.isInFountainRoom(fountain.getRow(), fountain.getCol())) {
//                    fountain.activateFountain();
//                } else {
//                    System.out.println("You're not in the fountain room.");
//            } break;
//            case "quit":
//                return;
//            default:
//                System.out.println("please try again");
//                break;

        return false;
    }
}
