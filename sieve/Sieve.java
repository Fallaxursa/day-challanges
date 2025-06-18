package sieve;

import java.util.function.Predicate;

public class Sieve {


    public boolean isGood(int num, Predicate<Integer> condition) {
        return condition.test(num);
    }
}
