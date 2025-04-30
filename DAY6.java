import java.util.Scanner;

public class DAY6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("how many eggs are there? ");
        int eggs = input.nextInt();
        int dev = eggs / 2;
        int remain = eggs % 2;
        if (eggs == 1) {
            System.out.println("the duckbear gets 1");
        }
        else {
            System.out.println("the sisters each get " + dev + " and the duck bear gets " + remain);
        }
    }
}
