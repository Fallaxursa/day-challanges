package queue;

import java.util.ArrayList;

public class Que implements Queue {
    ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void add(int value) {
        for (int i = 0; i < value; i++) {
            list.add(i);
        }
    }

    @Override
    public int remove(int index) {
        return list.remove(index);
    }

    @Override
    public int peek() {
        return list.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println();
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public void clear(int n) {
        for (int i = 0; i < n; i++) {
            list.removeFirst();
        }
    }

    @Override
    public void printReverse() {
        for (int i = 0, j = list.size() - 1; i < j; i++) {
            list.add(i, list.remove(j));
        }
        print();
    }

    @Override
    public void jumpTheQueue(int n, int value) {
        list.add(n, value);
    }

    @Override
    public String toString() {
        list.toString();
        System.out.println(list);
        return null;
    }

    @Override
    public boolean equals(Queue q) {
        return list.contains(q);
    }

    @Override
    public int indexOf(int value) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.equals(value)) {
//                return list.get(i);
//            }
//        }
        return list.getLast();
    }

    @Override
    public int lastIndexOf(int value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.getLast().equals(value)) {
                return list.get(i);
            }
        }
        return list.getLast();
    }

}
