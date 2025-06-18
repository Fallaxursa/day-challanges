package Utilities;

import java.util.Random;

public class RandomUtils {
    private static final Random random = new Random();

    public static double nextDouble(double max) {
        return new Random().nextDouble() * max;
    }

    public static String nextString(String... options) {
        if (options.length == 0) return null;
        return options[new Random().nextInt(options.length)];
    }

    public static boolean coinFlip() {
        return new Random().nextBoolean();
    }

    public static boolean coinFlip(double chanceOfTrue) {
        return random.nextDouble() < chanceOfTrue;
    }
}
