package practice8;

/*9.Задание Без двух нулей
Даны числа a и b. Определите, сколько существует последовательностей
из a нулей и b единиц, в которых никакие два нуля не стоят рядом.*/

import java.util.Scanner;

public class z9 {
    public static long count(int a, int b, boolean canZero) {
        if (a == 0 && b == 0) {
            return 1;
        }
        long result = 0;
        if (a > 0 && canZero) {
            result += count(a - 1, b, false);
        }
        if (b > 0) {
            result += count(a, b - 1, true);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите a (нулей) и b (единиц): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Количество последовательностей: " + count(a, b, true));
    }
}