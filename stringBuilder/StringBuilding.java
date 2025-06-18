package stringBuilder;

import java.util.ArrayList;
import java.util.Scanner;

public class StringBuilding {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        StringBuilder string = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter input: ");
        String in = input.nextLine();

        string.append(in);
        System.out.println(string);

        reverse.append(string);
        reverse.reverse();

        System.out.println(reverse);

        if (compare(string, reverse)) {
            System.out.println("its a palendrom!");
        }

    }

    public static boolean compare(StringBuilder one, StringBuilder two) {
        for (int i = 0; i < one.length(); i++) {
            if (one.charAt(i) != two.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
