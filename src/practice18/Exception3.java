package practice18;

import java.util.Scanner;

public class Exception3 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Не целое число");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (Exception e) {
            System.out.println("Прочее исключение: " + e);
        }
    }
    public static void main(String[] args) {
        new Exception3().exceptionDemo();
    }

    /*Если расположить catch (Exception e) в конце — поведение не меняется:
    конкретные исключения ловятся своими блоками, а общий Exception служит страховкой на случай непредвиденных исключений.
    Если же его поставить первым (что не компилируется), идея была бы в том, что все исключения (включая NumberFormatException и ArithmeticException)
    попали бы в один общий обработчик, и мы потеряли бы возможность различать типы ошибок.
    */
}
