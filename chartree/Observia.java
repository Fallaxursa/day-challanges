package chartree;

import java.util.Random;

public class Observia {
    public static void main(String[] args) {
        CharberryTree tree = new CharberryTree();
        Notifier notifier = new Notifier();
        while (true) tree.maybeGrow();

//        notifier.hasGrown();
    }
}

class CharberryTree {
    private Random random = new Random();
//    Notifier notifier = new Notifier();
    private boolean ripe = false;

    public boolean isRipe() {
        return ripe;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public void maybeGrow() {

        // Only a tiny chance of ripening each time, but we try a lot!
        if (random.nextDouble() < 0.00000001 && !ripe)
            setRipe(true);
    }
}

class Notifier {
    public void hasGrown(boolean isRipe) {

    }

}
