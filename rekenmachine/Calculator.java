package rekenmachine;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int numb1 = 0;
        int numb2 = 0;
        String op = "";

        try {
            System.out.print("Enter numbers: ");
            input = scanner.nextLine();

            System.out.println("You entered: " + input);
        } catch (InputMismatchException e) {
            System.out.println("ERROR: Enter a numeric value.");
        } catch (NumberFormatException e) {
            System.out.println("ERROR: No strings allowed :(");
        }

        String[] array = input.split(" ");
        ArrayList<String> operators = new ArrayList<>();

        for(String i : array) {
            if (i.contains("+")) {
                operators.add(i);
            }
            if (i.contains("-")) {
                operators.add(i);
            }
            if (i.contains("/")) {
                operators.add(i);
            }
            if (i.contains("*")) {
                operators.add(i);
            }

            System.out.println(i);
        }
        try {
            numb1 = Integer.parseInt(array[0]);
            op = array[1];
            numb2 = Integer.parseInt(array[2]);
        } catch (NumberFormatException e) {
            System.out.println("ERROR: No strings allowed :(");
        }

        switch (op) {
            case "+" -> {
                add(numb1, numb2);
            }
            case "-" -> {
                remove(numb1, numb2);
            }
            case "/" -> {
                try {
                    divide(numb1, numb2);
                } catch (DivideByZeroExeption e) {
                    System.out.println(e.getMessage());
                }
            }
            case "*" -> {
                multiply(numb1, numb2);
            }
            default -> {
                add(numb1, numb2);
            }
        }


    }

    public static void divide( int a, int b) {
        if (b == 0) {
            throw new DivideByZeroExeption("ERROR: Division by zero is impossible.");
        }
        System.out.println("Result: " + (a / b));

    }

    public static void add(int a, int b) {
        System.out.println("Result: " + (a + b));
    }

    public static void remove(int a, int b) {
        System.out.println("Result: " + (a - b));
    }

    public static void multiply(int a, int b) {
        System.out.println("Result: " + (a * b));
    }
}

class DivideByZeroExeption extends RuntimeException {
    public DivideByZeroExeption(String s) {
        super(s);
    }
}