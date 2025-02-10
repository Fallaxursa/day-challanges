import java.sql.SQLOutput;
import java.util.Scanner;

public class dAY9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many tick/tocks are there");
        int numb = input.nextInt();

        int i = 0;
        while (i < numb) {
            if (numb % 2 != 0) {
                System.out.println(numb);
            }
//            System.out.println(numb);
            ;
        }
    }
}
