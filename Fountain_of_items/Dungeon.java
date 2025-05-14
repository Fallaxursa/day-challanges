package Fountain_of_items;

import java.util.List;
import java.util.Map;

import static java.lang.Math.clamp;

public class Dungeon {
    Room[][] rooms;
    int size;

    // Makes pit coordinates depending on room size chosen
    private static final Map<Integer, List<int[]>> pitCoordinates = Map.of(
            4, List.of(new int[]{2, 3}),
            6, List.of(new int[]{2, 3}, new int[]{4, 6}),
            8, List.of(new int[]{2, 3}, new int[]{4, 6}, new int[]{2, 7})
    );

    //Makes maelstrom coordinates depending on room size chosen.
    private static final Map<Integer, List<int[]>> maelstromCoordinates = Map.of(
            4, List.of(new int[]{1, 1}),
            6, List.of(new int[]{2, 2}),
            8, List.of(new int[]{3, 3}, new int[]{5, 5})
    );

    public Dungeon(int size) {
        this.size = size;
        rooms = new Room[size][size];
        placeEmpty();
        placePits();
        placeMaelstroms();
        placeFountain();
        placeEntrance();
    }

    // Makes all coordinates on map empty rooms.
    private void placeEmpty() {
        for (int i = 0; i < size; i++) { //makes sure all other rooms are empty
            for (int j = 0; j < size; j++) {
                rooms[i][j] = new Room(RoomType.EMPTY, "");
            }
        }
    }

    // Places entrance on map.
    private void placeEntrance() {
        // Standard entrance always at 0,0
        rooms[0][0] = new Entrance();
    }

    // Places pits on map.
    private void placePits() {
        List<int[]> pits = pitCoordinates.get(size);
        if (pits != null) {
            for (int[] coords : pits) {
                int row = coords[0];
                int col = coords[1];
                if (isInBounds(row, col)) {
                    rooms[row][col] = new Pit();
                } else {
                    System.out.println(STR."Pit location out of bounds: \{row}, \{col}");
                }
            }
        }
    }

    public boolean isAdjacentToPit(Player player) {
        int row = player.getRow();
        int col = player.getCol();

        //Directions: NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST.
        int[][] directions = {
                {-1, 0},
                {-1, 1},
                {0, 1},
                {1, 1},
                {1, 0},
                {1, -1},
                {0, -1},
                {-1,-1},
        };

        //Checks all adjacent rooms.
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            //Checks if coordinates are in bounds.
            if (isInBounds(newRow, newCol)) {
                Room adjacentRoom = rooms[newRow][newCol];
                if (adjacentRoom != null && adjacentRoom.getRoomType() == RoomType.PIT) {
                    return true;
                }
            }
        }
        return false;
    }

    // Decides and places fountain on map.
    private void placeFountain() {
        int fountainRow = 0, fountainCol = 0;
        int pitRow, pitCol;

        // Decides where the fountain goes for each size
        switch (size) {
            case 4 -> {
                fountainRow = 0; fountainCol = 2;
            }
            case 6 -> {
                fountainRow = 3; fountainCol = 5;
            }
            case 8 -> {
                fountainRow = 4; fountainCol = 5;
            }
        }
        rooms[fountainRow][fountainCol] = new Fountain();
    }

    // Places maelstroms on map.
    private void placeMaelstroms() {
        List<int[]> positions = maelstromCoordinates.get(size);
        if (positions != null) {
            for (int[] coords : positions) {
                int row = coords[0];
                int col = coords[1];
                if (isInBounds(row, col)) {
                    rooms[row][col] = new Maelstrom();
                } else {
                    System.out.println(STR."Maelstrom out of bounds: \{row}, \{col}");
                }
            }
        }
    }

    // Checks if player is adjacent to maelstrom room.
    public boolean isAdjacentToMaelstrom(Player player) {
        int row = player.getRow();
        int col = player.getCol();

        //Directions: NORTH, NORTHEAST, EAST, SOUTHEAST, SOUTH, SOUTHWEST, WEST, NORTHWEST.
        int[][] directions = {
                {-1, 0},
                {-1, 1},
                {0, 1},
                {1, 1},
                {1, 0},
                {1, -1},
                {0, -1},
                {-1,-1},
        };

        //Checks all adjacent rooms.
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            //Checks if coordinates are in bounds.
            if (isInBounds(newRow, newCol)) {
                Room adjacentRoom = rooms[newRow][newCol];
                if (adjacentRoom != null && adjacentRoom.getRoomType() == RoomType.MAELSTROM) {
                    return true;
                }
            }
        }
        return false;
    }

    // Places player a specific amount row and col away.
    private void displacePlayer(Player player, int rowShift, int colShift) {
        int newRow = clamp(player.getRow() + rowShift, 0, size - 1);
        int newCol = clamp(player.getCol() + colShift, 0, size - 1);
        player.setPosition(newRow, newCol);
        System.out.println(STR."The maelstrom throws you to (Row=\{newRow}, Col=\{newCol})!");
    }

    // Places maelstrom a specific amount of row and col away.
    private void moveMaelstromFrom(int row, int col, int rowShift, int colShift) {
        int newRow = clamp(row + rowShift, 0, size - 1);
        int newCol = clamp(col + colShift, 0, size - 1);
        rooms[row][col] = new Room(RoomType.EMPTY, ""); // Clears old maelstrom room.
        rooms[newRow][newRow] = new Maelstrom(); //Places new maelstrom room.
    }

    // Checks if room is in bounds of grid.
    private boolean isInBounds(int row, int col) {

        return row >= 0 && row < size && col >= 0 && col < size;
    }

    // Checks if player hits boundary of map.
    public boolean canMove(Player player, Direction direction) {
        boolean legal = switch (direction) {
            case NORTH -> player.getRow() > 0;
            case SOUTH -> player.getRow() < size - 1;
            case EAST -> player.getCol() < size - 1;
            case WEST -> player.getCol() > 0;
        };

        if (!legal)
            System.out.println("You can't continue this way");

        return legal;
    }

    void preAct(Player player) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(STR."You are in the room at (Row=\{player.getRow()}, Column=\{player.getCol()})");

        if (isAdjacentToMaelstrom(player)) {
            System.out.println("You hear the growling and groaning of a maelstrom nearby.");
        }

        if (isAdjacentToPit(player)) {
            System.out.println("You feel a draft. There is a pit in a nearby room.");
        }
        rooms[player.getRow()][player.getCol()].visit();
    }

    boolean postAct(Player player) {
        Room currentRoom = getCurrentRoom(player);

        if (currentRoom.getRoomType() == RoomType.MAELSTROM) {
            System.out.println("You were swept up by a maelstrom!");

            //Automatically moves player .
            displacePlayer(player, -1, 2);

            //Automatically moves maelstrom.
            moveMaelstromFrom(player.getRow(), player.getCol(), 1, -2);

            return false; //Doesn't end the game.
        }

        if (currentRoom.getRoomType() == RoomType.PIT) {
            System.out.println("You have fallen in a pit and died");
            return true;
        }

        if (currentRoom.getRoomType() == RoomType.ENTRANCE && Fountain.isActivated()) { //Win condition
            System.out.println("You successfully reactivated the fountain and made your way out!!");
            return true;
        }

        return false;
    }

    Room getCurrentRoom(Player player) {
        int row = player.getRow();
        int col = player.getCol();

        if (!isInBounds(row, col)) {
            System.err.println("ERROR: Player out of bounds at (" + row + ", " + col + ")");
            return null;
        }

        Room room = rooms[row][col];
        if (room == null) {
            System.err.println("ERROR: Room at (" + row + ", " + col + ") is null.");
        }

        return room;
//        return rooms[player.getRow()][player.getCol()];
    }
}