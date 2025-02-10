package locked_door;

import java.util.Scanner;

public class DAY26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean Choice = false;

        System.out.println("input code: ");
        int New_code = input.nextInt();

        Door Door = new Door(1234);

        while (Choice == false) {
            System.out.println("what do you want to do? ");
            System.out.println("input code. ");
            System.out.println("change code. ");
            String choice = input.next();

//            if () {
//
//            }
        }


    }
}
