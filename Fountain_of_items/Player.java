package Fountain_of_items;

public class Player {
    private int playerRow = 0;
    private int playerCol = 0;
    private int mapSize;
    boolean canMove;

    public int getPlayerCol() {
        return playerCol;
    }

    public int getPlayerRow() {
        return playerRow;
    }

    public Player(int mapSize) {
        this.mapSize = mapSize;
    }

    public boolean isOnEntrance() {
        return getPlayerRow() == 0 && getPlayerCol() == 0;
    }

    public boolean canMove(String direction) {
        switch (direction.toLowerCase()) {
            case "north":
                return playerRow > 0;
            case "south":
                return playerRow < mapSize - 1;
            case "east":
                return  playerCol < mapSize - 1;
            case "west":
                return  playerCol > 0;
            default:
                return false;
        }
    }

    public void moveNorth() {
        if (canMove("north")) {
            playerRow--;
            System.out.println(STR."Moved to: (\{getPlayerRow()}, \{getPlayerCol()})");
        } else {
            System.out.println("you can't continue this way");
        }
    }

    public void moveEast() {
        if (canMove("east")) {
            playerCol++;
            System.out.println(STR."Moved to: (\{getPlayerRow()}, \{getPlayerCol()})");
        } else {
            System.out.println("you can't continue this way");
        }
    }

    public void moveSouth() {
        if (canMove("south")) {
            playerRow++;
            System.out.println(STR."Moved to: (\{getPlayerRow()}, \{getPlayerCol()})");
        } else {
            System.out.println("you can't continue this way");
        }
    }

    public void moveWest() {
        if (canMove("west")) {
            playerCol--;
            System.out.println(STR."Moved to: (\{getPlayerRow()}, \{getPlayerCol()})");
        } else {
            System.out.println("you can't continue this way");
        }
    }
}
