package practice18;

import java.util.Scanner;

public class Exception7 {
    public void getKey() throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        String key = myScanner.next();
        printDetails(key);
        myScanner.close();
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        try {
            new Exception7().getKey();
        } catch (Exception e) {
            System.out.println("Перехвачено в main: " + e.getMessage());
        }
    }
}
