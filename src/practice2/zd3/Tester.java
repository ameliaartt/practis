package practice2.zd3;

import java.util.Scanner;
public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void addCircle(Circle c) {
        if (count < circles.length) {
            circles[count++] = c;
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(5);
        tester.addCircle(new Circle(new Point(0, 0), 5.0));
        tester.addCircle(new Circle(new Point(1, 1), 3.0));
        for (int i = 0; i < tester.count; i++) {
            System.out.println(tester.circles[i]);
        }
    }
}
