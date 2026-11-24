package practice21;

public class Main3 {
    public static <T> T getElement(T[] array, int index) {
        if (array == null || index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
        return array[index];
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "c"};
        Integer[] numbers = {10, 20, 30};
        Double[] doubles = {1.5, 2.5};

        System.out.println(getElement(strings, 1)); // b
        System.out.println(getElement(numbers, 2)); // 30
        System.out.println(getElement(doubles, 0)); // 1.5
    }
}
