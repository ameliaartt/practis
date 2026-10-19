package practice8;

/*11.Задание Количество единиц
Дана последовательность натуральных чисел (одно число в строке),
завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой
последовательности встречается число 1. Числа, идущие после двух нулей,
необходимо игнорировать.
В этой задаче нельзя использовать глобальные переменные и параметры, передаваемые в функцию.
Функция получает данные, считывая их с клавиатуры,
а не получая их в виде параметров. */

import java.util.Scanner;

public class z11 {
    static Scanner sc = new Scanner(System.in);

    public static int countOnes() {
        int x = sc.nextInt();

        if (x == 0) {
            int y = sc.nextInt();
            if (y == 0) {
                return 0;
            }
            return (y == 1 ? 1 : 0) + countOnes();
        }

        return (x == 1 ? 1 : 0) + countOnes();
    }

    public static void main(String[] args) {
        System.out.println("Введите числа (конец — два нуля подряд):");
        System.out.println("Количество единиц: " + countOnes());
    }
}