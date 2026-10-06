package practice7.z4;

public class Main {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();

        System.out.println("2^10 = " + mc1.power(2, 10));
        System.out.println("Модуль (3,4) = " + mc1.modulus(3, 4));

        MathFunc mf = new MathFunc();
        System.out.println("Длина окружности R=5: " + mf.circleLength(5));
    }
}
