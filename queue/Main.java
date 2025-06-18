package queue;

public class Main {
    public static void main(String[] args) {
        Que queue = new Que();
        Que queue2 = new Que();

        queue.add(5);

        queue.printReverse();
        System.out.println("\n" + queue.size());

        System.out.println(queue.peek());
        queue.clear();

        queue.add(15);
        queue.print();
        queue.clear(2);
        queue.print();
        queue.printReverse();
        System.out.println(queue.size());

        //Fix later V
        System.out.println(queue.equals(queue2));

        System.out.println(queue.indexOf(1));

        queue.print();
    }
}
