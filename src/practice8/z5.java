package practice8;

/*5.Задание Сумма цифр числа
Дано натуральное число N. Вычислите сумму его цифр. При решении этой задачи нельзя использовать строки, списки, массивы
(ну и циклы, разумеется). */

import java.util.Scanner;

public class z5 {
    public static int sumNumbers(int n) {
        if (n < 10){
            return n;
        }
        return (n % 10) + sumNumbers(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = sc.nextInt();
        System.out.println("Сумма цифр числа " + n + " = " + sumNumbers(n));
    }
}