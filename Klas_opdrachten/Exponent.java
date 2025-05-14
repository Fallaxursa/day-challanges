package Klas_opdrachten;

public class Exponent {
    public int exponent(int base, int exp) {
        int result = (int) Math.pow(base, exp);
        return result;
    }

    public boolean isOdd(int result) {
        if (result % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
