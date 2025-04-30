import java.util.Scanner;
import Utilities.Colors;

public class password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.println("the password have to be 6-13 letters long");
            System.out.println("the has to contain at least one lower case letter, one upper case letter, and one number");
            System.out.println("it cannot have a capital T nor a ampersand(&)");
            System.out.println("please input password: ");
            String password = input.next();

            if (isValidPassword(password)) {
                System.out.println("the password " + password + " is... " + Colors.color("valid", Colors.BLUE));
                i++;
            } else {
                System.out.println(Colors.color("your password is invalid", Colors.RED));
            }


        }

    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.length() > 13) {
        return false;
        }

        boolean hasCapital = false;
        boolean hasLower = false;
        boolean hasNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasCapital = true;
            }
            else if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            else if (Character.isDigit(c)) {
                hasNumber = true;
            }
            if (c == 'T' || c == '&') {
                return false;
            }
        }
        return hasCapital && hasLower && hasNumber;
    }
}
