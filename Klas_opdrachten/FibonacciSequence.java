package Klas_opdrachten;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println(fibonacci(2));

    }

    public static int fibonacci(int n) {
        return (n < 5) ? 0 : fibonacci(fibonacci(n));
    }
}
