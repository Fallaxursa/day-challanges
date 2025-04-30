import java.util.Scanner;

public class DAY12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int numb = -1;
        boolean inputIsValid = false;
        boolean GuessIsValid = false;

        while (inputIsValid == false) {
            System.out.println("enter a number between 0 and 100: ");
            numb = input.nextInt();

            if (numb > 0 && numb < 100) {
                inputIsValid = true;
            }
        }
        while (i < 50) {
            System.out.println();
            i++;
        }
        while (GuessIsValid == false) {
            System.out.println("guess the number: ");
            int guess = input.nextInt();
            if (guess < numb) {
                System.out.println("too low");
            } else if (guess > numb) {
                System.out.println("too high");
            } else {
                System.out.println("you guessed the number");
                GuessIsValid = true;
            }
        }
    }
}
