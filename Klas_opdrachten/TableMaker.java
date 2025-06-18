package Klas_opdrachten;

import java.util.Scanner;

public class TableMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tabelmaker: Give size in int: ");
        int n = input.nextInt();

        int add = 1;

        System.out.print("* |");


        for (int i = 1; i <= n; i++) {
            System.out.print("   " + i);
        }

        System.out.println("\n -+---------------------------------------------");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " |   ");

            for (int j = 1; j <= n; j++) {
                System.out.printf("%3d", result(i, j) );
            }
            System.out.println();

        }

    }

    private static int result(int num1, int num2) {
        return num1 * num2;
    }
}
