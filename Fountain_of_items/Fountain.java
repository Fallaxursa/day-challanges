package Fountain_of_items;

public class Fountain {
    private int row;
    private int col;
    boolean fountainOn;

    public Fountain(int col, int row) {
        this.col = col;
        this.row = row;
        this.fountainOn = false;
    }

    public boolean activateFountain() {
        if (!fountainOn) {
            fountainOn = true;
            System.out.println("You hear water flowing from within the fountain. It has been reactivated!");
        } else {
            System.out.println("You have already activated the fountain");
        }
        return fountainOn;
    }

    public boolean isInFountainRoom(int playerRow, int playerCol) {
        return this.row == playerRow && this.col == playerCol;
    }

    public boolean isFountainOn() { return fountainOn; }
    public int getRow() { return row; }
    public int getCol() { return col; }
}
