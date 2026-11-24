package practice21;

import java.util.Arrays;

public class Main2<T> {
    private Object[] elements;
    private int size;

    public Main2(int capacity) {
        elements = new Object[capacity];
        size = 0;
    }

    public void add(T element) {
        if (size >= elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
        elements[size++] = element;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public int size() { return size; }

    public static void main(String[] args) {
        Main2<Integer> ints = new Main2<>(2);
        ints.add(10);
        ints.add(20);
        ints.add(30);
        System.out.println("int: " + ints.get(0) + ", " + ints.get(2));

        Main2<Long> longs = new Main2<>(1);
        longs.add(100L);
        System.out.println("long: " + longs.get(0));

        Main2<String> strs = new Main2<>(1);
        strs.add("Hello");
        System.out.println("string: " + strs.get(0));
    }
}