package practice18;

import java.util.Scanner;

public class Exception2{
    /*
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
    }
    Qwerty: Integer.parseInt("Qwerty") не может преобразовать строку в число
    выдаёт: java.lang.NumberFormatException
    0: Парсинг успешен, i = 0, затем 2 / 0
    выдаёт: java.lang.ArithmeticException: / by zero
    1.2: Integer.parseInt("1.2") не принимает точку
    выдаёт: java.lang.NumberFormatException: For input string: "1.2"
    1: Парсинг успешен, 2 / 1 = 2
    выдаёт: Исключения нет, выводится 2
    */
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не целое число (" + e.getMessage() + ")");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }
    }
    public static void main(String[] args) {
        new Exception2().exceptionDemo();
    }

}
