package practice2.zd6;

import java.util.Scanner;
public class CircleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус первой окружности: ");
        Circle c1 = new Circle(scanner.nextDouble());
        System.out.print("Введите радиус второй окружности: ");
        Circle c2 = new Circle(scanner.nextDouble());

        System.out.printf("Площадь первой окружности: %.3f%n", c1.getArea());
        System.out.printf("Длина первой окружности: %.3f%n", c1.getLength());
        System.out.printf("Площадь второй окружности: %.3f%n", c2.getArea());
        System.out.printf("Длина второй окружности: %.3f%n", c2.getLength());
        System.out.println("\nОкружности равны? " + c1.isEqual(c2));
    }
}
