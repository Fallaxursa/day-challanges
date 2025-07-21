package typeSpeedTest;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        int score = 0;
        String filename = name + ".txt";

        File file = new File(filename);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line = br.readLine();
                if (line != null) {
                    score = Integer.parseInt(line.trim());
                    System.out.println("Hello again, " + name + "! Your current score is: " + score);
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error cant read previous score, starting at 0.");
            }
        } else {
            System.out.println("Welcome, " + name + "! Starting with score 0.");
        }

        while (true) {
            System.out.print("Type your line (Type 'IO' to quit): ");
            String input = scanner.nextLine();

            if (input.equals("IO")) {
                System.out.println("Your final score is: " + score);
                break;
            }

            score += input.length();
            System.out.println("Updated score: " + score);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(String.valueOf(score));
        } catch (IOException e) {
            System.out.println("ERROR saving score.");
        }

        scanner.close();
    }
}
