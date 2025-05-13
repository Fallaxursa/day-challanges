package Fountain_of_items;

public class Dungeon {
    Room[][] rooms;
    int size;

    public Dungeon(int size) {
        rooms = new Room[size][size];

        for (int i = 0; i < size; i++) { //makes sure all other rooms are empty
            for (int j = 0; j < size; j++) {
                rooms[i][j] = new Room(RoomType.EMPTY, "");
            }
        }

        int fountainRow = 0, fountainCol = 0;
        int pitRow = 0, pitCol = 0;

        // Decides where the fountain goes for each size
        switch (size) {
            case 4 -> { fountainRow = 0; fountainCol = 2; }
            case 6 -> { fountainRow = 3; fountainCol = 5; }
            case 8 -> { fountainRow = 4; fountainCol = 5; }
        }

        switch (size) {
            case 4 -> {
                pitRow = 2; pitCol = 3;
                rooms[pitRow][pitCol] = new Pit();}
            case 6 -> {
                pitRow = 2; pitCol = 3;
                rooms[pitRow][pitCol] = new Pit();
                pitRow = 2; pitCol = 3;
                rooms[pitRow][pitCol] = new Pit();
            }
        }

        rooms[fountainRow][fountainCol] = new Fountain();
        rooms[pitRow][pitCol] = new Pit();

        // Standard entrance always at 0,0
        rooms[0][0] = new Entrance();
        this.size = size;
    }

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

        rooms[player.getRow()][player.getCol()].visit();
    }

    void postAct(Player player) {
        Room currentRoom = getCurrentRoom(player);

//        if (pit.isInPitRoom(player.getPlayerRow(), player.getPlayerCol())) { //Lose condition
//            System.out.println("you are in a pit and died");
//            return;
//        }


        if (currentRoom.getRoomType() == RoomType.ENTRANCE ) { //Win condition NEEDS TO ADD FOUNTAIN TRIGGER
            System.out.println("You successfully reactivated the fountain and made your way out!!");

        }
    }

    Room getCurrentRoom(Player player) {
        return rooms[player.getRow()][player.getCol()];
    }
}
