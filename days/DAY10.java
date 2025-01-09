import java.util.Scanner;

public class DAY10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter x value ");
         int x = input.nextInt();
        System.out.println("enter y value  ");
        int y = input.nextInt();

        System.out.println(x);
        System.out.println(y);

        Enemy enemy = new Enemy();

        if (x == enemy.enemyX) {
            System.out.println("the enemy is on the same x axis as you");
        } else if (x < enemy.enemyX) {
            System.out.println("the enemy is west");
        } else {
            System.out.println("the enemy is north");
        }

        if (y == enemy.enemyY) {
            System.out.println("the enemy is on the same y axis as you");
        } else if (y < enemy.enemyY) {
            System.out.println("the enemy is south");
        } else {
            System.out.println("the enemy is north");
        }

        if (x == enemy.enemyX && y == enemy.enemyY){
            System.out.println("you have found the enemy!!");
        }
    }
}