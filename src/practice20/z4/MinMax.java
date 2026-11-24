package practice20.z4;

import java.util.Arrays;

public class MinMax<T extends Comparable<T>> {
    private final T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T min() {
        if (array == null || array.length == 0)
            throw new IllegalStateException("Массив пуст");
        T m = array[0];
        for (T item : array) {
            if (item.compareTo(m) < 0) m = item;
        }
        return m;
    }

    public T max() {
        if (array == null || array.length == 0)
            throw new IllegalStateException("Массив пуст");
        T m = array[0];
        for (T item : array) {
            if (item.compareTo(m) > 0) m = item;
        }
        return m;
    }

    @Override
    public String toString() {
        return "MinMax" + Arrays.toString(array) + " -> min=" + min() + ", max=" + max();
    }
}
