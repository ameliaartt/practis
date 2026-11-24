package practice18;

public class Exception1 {
    /*
    public void exceptionDemo() {
        System.out.println(2 / 0);
    }
    Выводит java.lang.ArithmeticException: / by zero.
    Программа аварийно завершается, так как исключение нигде не перехвачено.
    Целочисленное деление на ноль в Java не определено, поэтому виртуальная машина
    генерирует исключение ArithmeticException (наследник RuntimeException).
    Поскольку оно непроверяемое и не обработано, оно всплывает до main и завершает поток.
    */
    /*
    public void exceptionDemo() {
        System.out.println(2.0 / 0.0);
    }
    Выводит Infinity.
    Для чисел с плавающей точкой определён стандарт IEEE 754, согласно которому деление
    ненулевого числа на ноль даёт Infinity. Исключение ArithmeticException в этом случае не генерируется.
    */

    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }
    /*выводится Attempted division by zero.
    Блок try содержит потенциально опасный код. При возникновении ArithmeticException управление передаётся
    в соответствующий catch, который печатает сообщение. Программа продолжает работу после блока catch.*/
    public static void main(String[] args) {
        new Exception1().exceptionDemo();
    }
}
