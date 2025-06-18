package sieve;

import queue.IsGood;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Predicate<Integer> isEven = num -> num % 2 ==0;
        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> isDivisibleByTen = num -> num % 10 == 0;
        boolean on = true;

        Sieve sieve = new Sieve();

        while(on) {
            System.out.print("Enter  number: ");
            int input = scanner.nextInt();
            scanner.nextLine();



            System.out.println("What predicate do you want to use?");
            System.out.println("isEven, isPositive, isDivisibleByTen, quit/exit");
            String predicate = scanner.nextLine().trim().toLowerCase();
            switch (predicate) {
                case "iseven" -> {
                    boolean res = sieve.isGood(input, isEven);
                    System.out.println("It is: " + res);
                }
                case "ispositive" -> {
                    boolean res = sieve.isGood(input, isPositive);
                    System.out.println("It is: " + res);
                }
                case "isdivisiblebyten" -> {
                    boolean res = sieve.isGood(input, isDivisibleByTen);
                    System.out.println("It is: " + res);
                }
                case "quit", "exit" -> {
                    System.out.println("Goodbye...");
                    on = false;
                }
            }




        }

//        boolean res = sieve.isGood(input);
    }



}
