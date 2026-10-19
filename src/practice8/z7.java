package practice8;

/*7.Задание Разложение на множители
Дано натуральное число n>1. Выведите все простые множители этого
числа в порядке не убывания с учетом кратности. Алгоритм должен иметь
сложность O(logn)*/

import java.util.Scanner;

public class z7 {
    public static void factorize(int n, int d) {
        if (n == 1) {
            return;
        }
        if (n % d == 0) {
            System.out.print(d + " ");
            factorize(n / d, d);
        } else {
            factorize(n, d + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = sc.nextInt();
        System.out.print("Множители: ");
        factorize(n, 2);
        System.out.println();
    }
}