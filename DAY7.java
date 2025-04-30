import java.util.Scanner;

public class DAY7 {

    public static void main(String[] args) {
       Scanner input = new Scanner( System.in);
       System.out.println("how many estates? ");
       int estates = input.nextInt();
       System.out.println("how many duchies? ");
       int dutchies = input.nextInt();
        System.out.println("how many provinces? ");
        int provinces = input.nextInt();

        int one = estates * 1;
        int two = dutchies * 3;
        int three = provinces * 6;

        int four = one + two + three;

        System.out.println("you have " + one + " estates and " + two + " duchies and " + three + " provinces totaling up to " + four);
    }
}
