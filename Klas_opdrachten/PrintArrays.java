package Klas_opdrachten;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stringSplit;

        while (true) {
            System.out.print("Input numbers of items: ");
            int NUM_ITEMS = input.nextInt();
            input.nextLine();

            if (NUM_ITEMS < -1 || NUM_ITEMS >= 10) {
                System.out.println("You cant put in negative numbers! Or double digit numbers! Try again.");
            }

            System.out.print("Input the content of the items(separate using space): ");
            String content = input.nextLine();

            stringSplit = content.split(" ");

            int[] nums = new int[NUM_ITEMS];

            for (int i = 0; i < NUM_ITEMS; i++) {
                nums[i] = Integer.parseInt(stringSplit[i]);
            }
            System.out.println(Arrays.toString(nums));

        }
    }
}
