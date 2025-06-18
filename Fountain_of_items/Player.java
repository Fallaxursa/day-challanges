package Fountain_of_items;

import Utilities.Colors;

import java.util.Scanner;

public class Player {
    private int playerRow = 0;
    private int playerCol = 0;
    private int arrows = 5;

    public int getCol() { return playerCol; }
    public int getRow() { return playerRow; }
    public int getArrows() { return arrows; }

    public void decreaseArrows() {
        arrows = Math.max(0, arrows - 1);
    }

    public boolean hasArrows() {
        return arrows > 0;
    }

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

    public void setPosition(int row, int col) {
        this.playerRow = row;
        this.playerCol = col;
    }

    public int roomSize(Scanner input) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print(Colors.color("How large do you want the cave to be(small, medium, big)? ", Colors.YELLOW));
        return switch (input.nextLine().toLowerCase()) {
            case "medium" -> 6;
            case "big" -> 8;
            default -> 4;
        };
    }

    boolean act(Dungeon dungeon, Scanner input) {
        System.out.print(Colors.color("What do you want to do? ",Colors.YELLOW));

        Room currentRoom = dungeon.getCurrentRoom(this);

        String act = input.nextLine().trim().toLowerCase();
        try {
            Direction chosenDirection = Direction.valueOf(act.toUpperCase());
            if (dungeon.canMove(this, chosenDirection))
                move(chosenDirection);
            return false;
        } catch (Exception e) {
            // DON'T CARE.
        }

        if (act.equals("log")) {
            System.out.println(Colors.color("What page do you want to read? ", Colors.YELLOW));
            System.out.println("pits, maelstroms, amaroks.");
            String logIn = input.nextLine();
            dungeon.logBook(logIn);
        } else if (act.equals("help")) {
            dungeon.help();
        } else if (act.startsWith("shoot ")) {
            if (!dungeon.isArmedChallangeEnabled()) {
                System.out.println(Colors.color("The armed challange is turned off.", Colors.RED));
            } else if (!hasArrows()) {
                System.out.println(Colors.color("You're out of arrows!", Colors.RED));
            } else {
                String dirString = act.substring(6).trim().toUpperCase();
                try {
                    Direction dir = Direction.valueOf(dirString);
                    dungeon.shootArrows(this, dir);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid");
                }
            }
        } else if (act.equals("activate")) {
            if (currentRoom.getRoomType() == RoomType.FOUNTAIN) {
                Fountain fountainRoom = (Fountain) currentRoom;
                fountainRoom.activate();
            }
        } else if (act.equals("quit")) {
            System.out.println(Colors.color("quiting game...", Colors.RED));
            return true;
        }
        return false;
    }
}