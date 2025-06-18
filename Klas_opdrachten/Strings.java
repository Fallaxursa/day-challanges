package Klas_opdrachten;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your string: ");
        String str = input.nextLine().trim();
        String r = " ";

        for ( int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            r = ch + r;
        }

        r = r.trim();

        if (str.equals(r)) {
            System.out.println("Your input is: " + str);
            System.out.println("And you got: " + r);
            System.out.println("its the SAME");
        } else {
            System.out.println("Your input is: " + str);
            System.out.println("And you got: " + r);
        }
    }
}
