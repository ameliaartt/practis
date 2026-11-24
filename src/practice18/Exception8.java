package practice18;

import java.util.Scanner;

public class Exception8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;
        while (!success) {
            try {
                System.out.print("Введите ключ: ");
                String key = myScanner.next();
                printDetails(key);
                success = true;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Попробуйте ещё раз.");
            }
        }
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
        new Exception8().getKey();
    }
}
