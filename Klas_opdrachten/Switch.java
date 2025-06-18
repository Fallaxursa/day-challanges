package Klas_opdrachten;

public class Switch {
    public static void main(String[] args) {
        String browser = "Edge";

        switch (browser) {
            case "Edge":
                System.out.println("you are using edge");
                break;
            case "Chrome", "Firefox", "Opera":
                System.out.println("you are using modern browsers");
                break;
            case "IE":
                System.out.println("why are you using internet explorer. shame on you!!");
                break;
            default:
                System.out.println("you arnt usins a supported browser");
                break;
        }

        switch (browser) {
            case "Firefox", "Chorme", "Opera" -> System.out.println("heheh");
            case "Edge" -> System.out.println("edge");
            case "IE" -> System.out.println("ewwwwwwww");
            default -> System.out.println("yes");
        }
    }
}
