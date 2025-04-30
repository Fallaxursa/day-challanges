import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter amount of parts");
        int parts = input.nextInt();

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
