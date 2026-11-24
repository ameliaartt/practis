package practice18;

import java.util.Scanner;

public class Exception4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: не целое число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        } finally {
            System.out.println("Блок finally выполнен (закрытие ресурсов и т.п.)");
        }
    }
    public static void main(String[] args) {
        new Exception4().exceptionDemo();
    }
    /*сообщение из finally выводится всегда — и при успешном выполнении, и при любом из исключений.*/
}
