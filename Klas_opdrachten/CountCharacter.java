package Klas_opdrachten;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input sentence: ");
        String in = input.nextLine().toLowerCase().replaceAll("[^a-z]", "");

        String allowed = "abcdefghijklmnopqrstuvwxyz0123456789";
        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (char c : allowed.toCharArray()) {
            counts.put(c, 0);
        }

        for (char c : in.toCharArray()) {
            if (counts.containsKey(c)) {
                counts.put(c, counts.get(c) + 1);
            }
        }

        int characters = in.length();
        System.out.println("Characters: " + characters);

        String[] words = in.split(" ");
        System.out.println("words " + words.length);

        int klinkers = 0;
        for (int i = 0; i < in.length(); i++) {
            switch (in.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u', 'y' -> klinkers++;
            }
        }
        System.out.println("klinkers " + klinkers);

        for (int i = 0; i <= in.length(); i++) {
            
        }

        System.out.print("a b c d e f g h i j k l m n o p q r s t u v w x y z 0 1 2 3 4 5 6 7 8 9  ");

    }
}
