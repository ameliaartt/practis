package practice21;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }

    public static void main(String[] args) {
        String[] strings = {"one", "two", "three"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        System.out.println(arrayToList(strings));
        System.out.println(arrayToList(numbers));
    }
}
