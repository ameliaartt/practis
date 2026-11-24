package practice20.z4;

public class Calculator {

    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0)
            throw new ArithmeticException("Деление на ноль");
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, U extends Number> double subtraction(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        MinMax<Integer> mm = new MinMax<>(new Integer[]{5, 2, 9, 1, 7});
        System.out.println(mm);

        System.out.println("sum(2, 3.5)       = " + Calculator.sum(2, 3.5));
        System.out.println("multiply(2, 3.5)  = " + Calculator.multiply(2, 3.5));
        System.out.println("divide(7.5, 2)    = " + Calculator.divide(7.5, 2));
        System.out.println("subtraction(7, 2) = " + Calculator.subtraction(7, 2));
    }
}
