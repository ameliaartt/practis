package practice2.zd8;

public class ReverseArray {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e"};
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
