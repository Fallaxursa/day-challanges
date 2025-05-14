package Klas_opdrachten;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Exponent exponent = new Exponent();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num1 = input.nextInt();
        System.out.print("Enter exponent: ");
        int exp1 = input.nextInt();
        int result = exponent.exponent(num1, exp1);

        boolean isEven = exponent.isOdd(result);
        System.out.println(STR."The result is: \{result}");
        System.out.println(STR."And the result boolean is: \{isEven}");
    }
}
