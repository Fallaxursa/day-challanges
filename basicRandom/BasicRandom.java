package basicRandom;

import java.text.DecimalFormat;
import java.util.Random;

public class BasicRandom {
    public static void main(String[] args) {
        DecimalFormat formatDouble = new DecimalFormat("#0.0");
        Random random = new Random();

        System.out.println(randomDouble(0, 1, formatDouble));
        System.out.println(randomDirection(random));
        System.out.println(randomBoolBias(random, 100));


        for (int i = 0; i < 30; i++) {
//            System.out.println(randomDouble(0, 1, formatDouble));
//            System.out.println(randomDirection(random));
//            System.out.println(randomBool(random));
            System.out.println(randomBoolBias(random, 25));
        }
    }

    public static double randomDouble(double min, double max, DecimalFormat format) {
        double x = (Math.random() * ((max - min) )) + min;
        double xRounded = Double.parseDouble(format.format(x));
        return xRounded;
    }

    public static String randomDirection(Random random) {
        int numb = random.nextInt(4);
        return switch (numb) {
            case 0 -> "up";
            case 1 -> "down";
            case 2 -> "left";
            case 3 -> "right";
            default -> "NO";
        };
    }

    public static Boolean randomBool(Random random) {
        return random.nextBoolean();
    }

    public static Boolean randomBoolBias(Random random, float p) {
        return random.nextFloat() < p;
    }
}
