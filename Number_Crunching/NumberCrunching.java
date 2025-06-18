package Number_Crunching;

import java.util.Optional;
import java.util.Scanner;

public class NumberCrunching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Optional<Integer> intvalue;
        do {
            System.out.print("Enter a number: ");
            String num = input.nextLine();
            intvalue = parseInt(num);
        } while (intvalue.isEmpty());

        System.out.println("You entered: " + intvalue.get());

        Optional<Double> doubleVal;
        do {
            System.out.print("Enter a double: ");
            String num = input.nextLine();
            doubleVal = parseDouble(num);
        } while (doubleVal.isEmpty());

        System.out.println("You entered: " + doubleVal.get());

        Optional<Boolean> booleanVal;
        do {
            System.out.print("Enter true/false: ");
            String num = input.nextLine();
            booleanVal = parseBoolean(num);
        } while (booleanVal.isEmpty());

        System.out.println("You entered: " + booleanVal.get());

    }

    public static Optional<Integer> parseInt(String num) {
        try {
            return Optional.of(Integer.parseInt(num));
        } catch (NumberFormatException e) {
            System.out.println("That wont work!");
            return Optional.empty();
        }
    }

    public  static Optional<Double> parseDouble(String num) {
        try {
            return Optional.of(Double.parseDouble(num));
        } catch (NumberFormatException e) {
            System.out.println("That wont work!");
            return Optional.empty();
        }
    }

    public static Optional<Boolean> parseBoolean(String num) {
        if (num == null) return Optional.empty();

        String lower = num.trim().toLowerCase();
        if (lower.equals("true") || lower.equals("yes") || lower.equals("1")) {
            return Optional.of(true);
        } else if (lower.equals("false") || lower.equals("no") || lower.equals("0")) {
            return Optional.of(false);
        } else {
            System.out.println("That wont work!");
            return Optional.empty();
        }
    }
}
