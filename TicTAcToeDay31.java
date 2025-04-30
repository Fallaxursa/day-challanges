import Utilities.User_input;
import java.util.*;

public class TicTAcToeDay31 {
    static String[] board;
    static String currentSymbol;
    static String currentPlayerName;
    static String p1, p2;

    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch(a) {
                case 0:
                    line = board[1] + board[2] + board[3];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            if (line.equals("XXX")) {
                return "X";
            }
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "draw";
            }
        }
        return null;
    }

    static void printBoard() {
        System.out.println("+---+---+---+");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("+---+---+---+");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        board = new String[9];
        currentSymbol = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("this is Tic tac toe!");

        p1 = User_input.AskForString("please enter name player 1 (X): ");
        p2 = User_input.AskForString("please enter name player 2 (O): ");

        String currentPlayerName = p1;
        printBoard();
        System.out.println("its now " + currentPlayerName + "'s turn!" + "( " + currentSymbol + " )");

        while(winner == null) {
            int numInput;
            try {
                numInput = input.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("that's invalid");
                    printBoard();
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("that's invalid. try again");
                printBoard();
                continue;
            }

            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = currentSymbol;

                printBoard();
                winner = checkWinner();

                if (currentSymbol.equals("X")) {
                    currentSymbol = "O";
                    currentPlayerName = p2;
                }
                else {
                    currentSymbol = "X";
                    currentPlayerName = p1;
                }
                System.out.println(currentPlayerName + "'s turn ( " + currentSymbol + " )");
            }
            else {
                System.out.println("that space is occupied. try again");
                printBoard();
            }
        }

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("u got a draw.");
        }
        else {
            String winnerName = winner.equals("X") ? p1 : p2;
            System.out.println(winnerName + " has won");
        }
        input.close();
        }
}
