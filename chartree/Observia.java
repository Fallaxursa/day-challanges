package chartree;

import java.util.Random;

public class Observia {
    public static void main(String[] args) {
        CharberryTree tree = new CharberryTree();

        while (true) tree.maybeGrow();


    }
}

class CharberryTree {
    private Random random = new Random();
    Notifier notifier = new Notifier();
//    Harvester harvester = new Harvester();
    private boolean ripe = false;

    public boolean getRipe() {
        return ripe;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public void isGrown() {
        notifier.hasGrown();
        setRipe(false);
    }

    public void maybeGrow() {

        // Only a tiny chance of ripening each time, but we try a lot!
        if (random.nextDouble() < 0.00000001 && !ripe)
            setRipe(true);

        if (getRipe()) {
            isGrown();
        }
    }
}

class Notifier {
    public void hasGrown() {
            System.out.println("A fruit has grown!!!");
    }

}

//class Harvester {
//    public boolean ripeReseter(boolean ripe) {
//        return ripe = false;
//    }
//}
