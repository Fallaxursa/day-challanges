package Klas_opdrachten;

import java.util.Scanner;

public class Calculating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit = true;
        int out = 0;
        int out2 = 0;


        while (quit) {
            System.out.print("Enter a number above 0: ");
            int num = input.nextInt();
            out = 0;
            out2 = 0;

            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    int ans = i % 2;
                    if (ans == 0) { //even num
                        out += i;
                        System.out.println(out);
                    } else { //uneven num
                        out2 += i;
                        System.out.println(out2);
                    }
                }
                System.out.print("the difference is: ");
                System.out.println(out - out2);
            } else {
                System.out.println("please try again");
            }
        }
    }
}
