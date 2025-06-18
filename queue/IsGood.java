package queue;

import java.util.function.Predicate;

public class IsGood {


    public static boolean isGood(int number, Predicate<Integer> predicate) {
        if (predicate.test(number)) {
            return true;
        }
        return false;
    }
}
