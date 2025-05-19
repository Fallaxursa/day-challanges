package Fountain_of_items;

import Utilities.Colors;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Math.clamp;

public class Dungeon {
    Room[][] rooms;
    int size;

    private boolean pitsChallange = false;
    private boolean maelstromChallange = false;
    private boolean amarokChallange = false;
    private boolean armedChallange = false;


    // Makes pit coordinates depending on room size chosen
    private static final Map<Integer, List<int[]>> pitCoordinates = Map.of(
            4, List.of(new int[]{2, 3}),
            6, List.of(new int[]{3, 3}, new int[]{4, 6}),
            8, List.of(new int[]{2, 3}, new int[]{4, 6}, new int[]{2, 7})
    );

    //Makes maelstrom coordinates depending on room size chosen.
    private static final Map<Integer, List<int[]>> maelstromCoordinates = Map.of(
            4, List.of(new int[]{1, 1}),
            6, List.of(new int[]{2, 2}),
            8, List.of(new int[]{3, 3}, new int[]{4, 5})
    );

    //Makes amarok coordinates depending on the room size chosen.
    private static final Map<Integer, List<int[]>> amarokCoordinates = Map.of(
            4, List.of(new int[]{1, 2}),
            6, List.of(new int[]{2, 3}, new int[]{3, 1}),
            8, List.of(new int[]{2, 1}, new int[]{5, 5}, new int[]{2, 6})
    );

    // All rooms get initialized here.
    public Dungeon(int size) {
        this.size = size;
        rooms = new Room[size][size];
        placeEmpty();
        if (isPitsChallangeEnabled()) {
            placePits();
        }
        if (isMaelstromChallangeEnabled()) {
            placeMaelstroms();
        }
        if (isAmarokChallangeEnabled()) {
            placeAmarok();
        }
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

    // Places amarok rooms.
    private void placeAmarok() {
        List<int[]> pits = amarokCoordinates.get(size);
        if (pits != null) {
            for (int[] coords : pits) {
                int row = coords[0];
                int col = coords[1];
                if (isInBounds(row, col)) {
                    rooms[row][col] = new Amarok();
                } else {
                    System.out.println(STR."Amarok location out of bounds: \{row}, \{col}");
                }
            }
        }
    }

    // Checks if player is adjacent to danger.
    public int isAdjacent(Player player) {
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
                if (adjacentRoom != null && adjacentRoom.getRoomType() == RoomType.AMAROK) {
                    return 1;
                } else if (adjacentRoom.getRoomType() == RoomType.MAELSTROM) {
                    return 2;
                } else if (adjacentRoom.getRoomType() == RoomType.PIT) {
                    return 3;
                }
            }
        }
        return 0;
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

    // Prints the whole map.
    public void printRooms() {
        System.out.println("Dungeon layout:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Room room = rooms[i][j];
                if (room == null) {
                    System.out.println(" ? ");
                    continue;
                }

                switch (room.getRoomType()) {
                    case ENTRANCE -> System.out.print(" E ");
                    case FOUNTAIN -> System.out.print(" F ");
                    case PIT -> System.out.print(" P ");
                    case MAELSTROM -> System.out.print(" M ");
                    case AMAROK -> System.out.print(" A ");
                    case EMPTY -> System.out.print(" . ");
                    default -> System.out.print(" ? ");
                }
            }
            System.out.println();
        }
    }

    // Handles shooting.
    public void shootArrows(Player player, Direction direction) {
        if (!player.hasArrows()) {
            System.out.println(Colors.color("You're out of arrows!", Colors.RED));
            return;
        }

        int targetRow = player.getRow();
        int targetCol = player.getCol();

        switch (direction) {
            case NORTH -> targetRow -= 1;
            case SOUTH -> targetRow += 1;
            case EAST -> targetCol += 1;
            case WEST -> targetCol -= 1;
        }

        if (!isInBounds(targetRow, targetCol)) {
            System.out.println(Colors.color("You shot a wall and broke your arrow.", Colors.RED));
            player.decreaseArrows();
            return;
        }

        Room targetRoom = rooms[targetRow][targetCol];
        if (targetRoom.getRoomType() == RoomType.AMAROK || targetRoom.getRoomType() == RoomType.MAELSTROM) {
            System.out.println(Colors.color("You hear a shriek from the darkness. A monster has been slain!", Colors.GREEN));
            rooms[targetRow][targetCol] = new Room(RoomType.EMPTY, "");// Changes room to empty room.
        } else {
            System.out.println(Colors.color("The arrow has shattered uselessly.", Colors.RED));
        }

        player.decreaseArrows();
    }

    // Checks if room is in bounds of grid.
    public boolean isInBounds(int row, int col) {

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
            System.out.println(Colors.color("You can't continue this way",Colors.RED));

        return legal;
    }

    public void logBook(String logIn) {
        switch (logIn) {
            case "pits" -> System.out.println("Look out for pits. You will feel a breeze if a pit is in an adjacent room. If you enter a room with a pit, you will die.");
            case "maelstroms" -> System.out.println("Maelstroms are violent forces of sentient wind. Entering a room with one could transport you to any other location" +
                    "in the caverns. You will be able to hear their growling and groaning in nearby rooms.");
            case "amaroks" -> System.out.println("Amaroks roam the" +
                    " caverns. Encountering one is certain death, but you can smell their rotten stench in nearby rooms.");
        }
    }

    public void help() {
        System.out.println("Available commands:");
        System.out.println("- north, south, east, west: move in a direction");
        System.out.println("- shoot <direction>: shoot an rrow in a direction (if you have arrows and the armed challange is on)");
        System.out.println("- activate: activate the Fountain of Objects");
        System.out.println("- log: read the lore about pits, maelstoms, amaroks");
        System.out.println("- help: display this help message");
        System.out.println("- quit: exit the game");
    }

    public void start(Scanner input) {
        System.out.println(Colors.color("You enter the Cavern of Objects, a maze of rooms filled with dangerous pits in search of the Fountain of Objects.", Colors.MAGENTA));
        System.out.println(Colors.color("Light is visible only in the entrance, and no other light is seen anywhere in the caverns.", Colors.MAGENTA));
        System.out.println(Colors.color("You must navigate the Caverns with your other senses.", Colors.MAGENTA));
        System.out.println(Colors.color("Find the Fountain of Objects, activate it, and return to the entrance.", Colors.MAGENTA));

        System.out.println(Colors.color("What challanges do you want to enable?", Colors.YELLOW));
        System.out.println(Colors.color("Type yes or no for each challange", Colors.BLUE));

        System.out.println("Enable pits? ");
        setPitsChallange(input.nextLine().trim().equalsIgnoreCase("yes"));

        System.out.println("Enable maelstroms? ");
        setMaelstromChallange(input.nextLine().trim().equalsIgnoreCase("yes"));

        System.out.println("Enable amaroks? ");
        setAmarokChallange(input.nextLine().trim().equalsIgnoreCase("yes"));

        System.out.println("Enable getting armed? ");
        setArmedChallange(input.nextLine().trim().equalsIgnoreCase("yes"));

        System.out.println("Challanges enabled:");
        if (isPitsChallangeEnabled()) System.out.println(" Look out for pits. You will feel a breeze if a pit is in an adjacent room. If you enter a room with a pit, you will die.");
        if (isMaelstromChallangeEnabled()) System.out.println("Maelstroms are violent forces of sentient wind. Entering a room with one could transport you to any other location in the caverns. You will be able to hear their growling and groaning in nearby rooms.");
        if (isAmarokChallangeEnabled()) System.out.println("Amaroks roam the caverns. Encountering one is certain death, but you can smell their rotten stench in nearby rooms");
        if (isArmedChallangeEnabled()) System.out.println("You carry with you a bow and a quiver of arrows. You can use them to shoot monsters in the caverns but be warned: you have a limited supply.");
    }

    // This triggers before the player can act and is mostly used for detection.
    void preAct(Player player) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(STR."You are in the room at (Row=\{player.getRow()}, Column=\{player.getCol()}) and have \{player.getArrows()} left");

        int adjacent = isAdjacent(player);

        // Prints the adjacent room dialogue.
        switch (adjacent) {
            case 1 -> System.out.println("You hear the growling and groaning of a maelstrom nearby.");
            case 2 -> System.out.println("you smell the rotting stench of an amarok nearby.");
            case 3 -> System.out.println("You feel a draft. There is a pit in a nearby room.");
        }

        rooms[player.getRow()][player.getCol()].visit();
    }

    // This triggers after the player acted and is usually used for game overs.
    boolean postAct(Player player) {
        Room currentRoom = getCurrentRoom(player);

        if (currentRoom.getRoomType() == RoomType.MAELSTROM) {
            System.out.println(Colors.color("You were swept up by a maelstrom!", Colors.YELLOW));

            //Automatically moves player .
            displacePlayer(player, -1, 2);

            //Automatically moves maelstrom.
            moveMaelstromFrom(player.getRow(), player.getCol(), 1, -2);

            return false; //Doesn't end the game.
        }

        if (currentRoom.getRoomType() == RoomType.AMAROK) {
            System.out.println(Colors.color("you have been caught by an amarok and died", Colors.RED));
            return true;
        }

        if (currentRoom.getRoomType() == RoomType.PIT) {
            System.out.println(Colors.color("You have fallen in a pit and died", Colors.RED));
            return true;
        }

        if (currentRoom.getRoomType() == RoomType.ENTRANCE && Fountain.isActivated()) { //Win condition
            System.out.println(Colors.color("You successfully reactivated the fountain and made your way out!!", Colors.CYAN));
            return true;
        }

        return false;
    }

    public void setArmedChallange(boolean armedChallange) {
        this.armedChallange = armedChallange;
    }
    public void setAmarokChallange(boolean amarokChallange) {
        this.amarokChallange = amarokChallange;
    }
    public void setMaelstromChallange(boolean maelstromChallange) {
        this.maelstromChallange = maelstromChallange;
    }
    public void setPitsChallange(boolean pitsChallange) {
        this.pitsChallange = pitsChallange;
    }

    public boolean isPitsChallangeEnabled() { return pitsChallange; }
    public boolean isMaelstromChallangeEnabled() { return  maelstromChallange; }
    public boolean isAmarokChallangeEnabled() { return  amarokChallange; }
    public boolean isArmedChallangeEnabled() { return armedChallange; }

    Room getCurrentRoom(Player player) {
        int row = player.getRow();
        int col = player.getCol();

        Room room = rooms[row][col];

        if (!isInBounds(row, col)) {
            System.err.println("ERROR: Player out of bounds at (" + row + ", " + col + ")");
            return null;
        }


        if (room == null) {
            System.err.println("ERROR: Room at (" + row + ", " + col + ") is null.");
        }

        return room;
    }
}