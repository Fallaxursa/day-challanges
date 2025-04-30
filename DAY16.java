import java.util.Scanner;

public class DAY16 {
//    taking a number

    public static int AskForNumber(String text) { //basic int input
        Scanner input = new Scanner (System.in);
        System.out.println(text + " ");
        int number = input.nextInt();
        return number;
    }

    public static int AskForNumberInRange(String text, int min, int max) { // advanced int input
        Scanner input = new Scanner (System.in);
        int number;

        while (true) {
            System.out.println(text + "(" + min + " to " + max + ")");
            number = input.nextInt();

            if (number >= min && number <= max) {
                return number;
            } else {
                System.out.println("that's invalid. please enter a number between " + min + " and " + max + ".");
            }
        }
    }

    public static void ClearTerminal() {
        for (int i = 0; i < 40; i++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {
//        int result = AskForNumber("enter a number please: ");
//        System.out.println("yor number is: " + result);
//        int result = AskForNumberInRange("enter a number between 5 and 60: ", 5, 60);
//        System.out.println("your number is: " + result);
        ClearTerminal();
    }
}
