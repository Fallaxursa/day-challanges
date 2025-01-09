import java.util.Scanner;

public class DAY5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what thing are we talking about?");
        String thing = input.next();
        System.out.println("how would you describe it? Big? Azure? Tattered?");
        String description = input.next();
        String end = " of doom 3000";
        System.out.println("the " + description + " " + thing + end);
    }
}
