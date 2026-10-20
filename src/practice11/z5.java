package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class z5 {

    private static final int N   = 20_000;
    private static final int OPS = 1_000;

    public static void main(String[] args) {
        Random rnd = new Random(42);

        for (int i = 0; i < 3; i++) {
            runAll(new ArrayList<>(),     new Random(42), false);
            runAll(new LinkedList<>(),    new Random(42), false);
        }

        System.out.println("ArrayList");
        runAll(new ArrayList<>(), new Random(42), true);

        System.out.println("\nLinkedList");
        runAll(new LinkedList<>(), new Random(42), true);
    }

    private static void runAll(List<Integer> list, Random rnd, boolean print) {

        long t = System.nanoTime();
        for (int i = 0; i < N; i++) list.add(i);
        if (print) report("add (в конец)", t);

        t = System.nanoTime();
        for (int i = 0; i < OPS; i++) list.add(0, -i);   // int → add(int index, E)
        if (print) report("add (в начало)", t);

        t = System.nanoTime();
        for (int i = 0; i < OPS; i++) list.add(list.size() / 2, -i);
        if (print) report("add (в середину)", t);

        t = System.nanoTime();
        for (int i = 0; i < OPS; i++) list.contains(rnd.nextInt(N));
        if (print) report("contains (поиск)", t);

        t = System.nanoTime();
        for (int i = 0; i < OPS; i++) {
            if (!list.isEmpty()) list.remove(0);
        }
        if (print) report("remove (из начала)", t);

        t = System.nanoTime();
        for (int i = 0; i < OPS; i++) {
            if (!list.isEmpty()) list.remove(list.size() - 1);
        }
        if (print) report("remove (из конца)", t);
    }

    private static void report(String op, long startNano) {
        long us = (System.nanoTime() - startNano) / 1_000;
        System.out.printf("  %-20s : %8d us%n", op, us);
    }
}