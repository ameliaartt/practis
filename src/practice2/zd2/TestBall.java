package practice2.zd2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        System.out.println("Введите данные о местоположении мячика:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        double x = scanner.nextInt();
        System.out.print("y = ");
        double y = scanner.nextInt();

        Ball ball1 = new Ball(x, y);
        System.out.println("x = " + ball1.getX());
        System.out.println("y = " + ball1.getY());
        System.out.print("Смените координаты:");
        System.out.print("x = ");
        double x2 = scanner.nextInt();
        System.out.print("y = ");
        double y2 = scanner.nextInt();
        ball1.setX(x2);
        ball1.setY(y2);
        System.out.println(ball1.toString());
        System.out.print("Смените координаты, другим способом:");
        System.out.print("x = ");
        double x3 = scanner.nextInt();
        System.out.print("y = ");
        double y3 = scanner.nextInt();
        ball1.setXY(x3, y3);
        System.out.println(ball1.toString());
        System.out.print("На сколько вы хотите сдвинуть мяч?:");
        System.out.print("x = ");
        double x4 = scanner.nextInt();
        System.out.print("y = ");
        double y4 = scanner.nextInt();
        ball1.move(x4, y4);
        System.out.println(ball1.toString());
        scanner.close();
    }
}
