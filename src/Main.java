import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*3. Написать программу, в результате которой массив чисел создается с
        помощью инициализации (как в Си) вводится и считается в цикле сумма
        элементов целочисленного массива, а также среднее арифметическое его
        элементов результат выводится на экран. Использовать цикл for. */
        System.out.println("Задание 3");
        int[] array1 = {1, 34, 67, 58, 34, 66, 90, 8, 9, 29};
        int res = 0;
        for(int i = 0; i < 10; i++) {
            res += array1[i];
        }
        System.out.println("summ = " + res);
        System.out.println("arith. mean = " + (res / 10));
        for(int i = 0; i < 10; i++) {
            System.out.print(array1[i] + " ");
        }
        /*4. Написать программу, в результате которой массив чисел вводится
        пользователем с клавиатуры считается сумма элементов целочисленного
        массива с помощью циклов do while, while, также необходимо найти
        максимальный и минимальный элемент в массиве, результат выводится на экран.*/
        System.out.println("Задание 4");
        Scanner scanner = new Scanner(System.in);
        System.out.print("n (array size) = ");
        int n = scanner.nextInt();
        int[] array2 = new int[n];
        System.out.print("Enter the array elements: ");
        array2[0] = scanner.nextInt();
        int res2 = array2[0];
        int max_num = 0;
        int min_num = array2[0];
        int i = 1;
        while(i < n) {
            array2[i] = scanner.nextInt();
            if (max_num < array2[i]) {
                max_num = array2[i];
            }
            if (min_num > array2[i]) {
                min_num = array2[i];
            }
            res2 += array2[i];
            i += 1;
        }
        System.out.println("summ = " + res2);
        System.out.println("max = " + max_num);
        System.out.println("min = " + min_num);

        /*5. Написать программу, в результате которой выводятся на экран
        аргументы командной строки в цикле for.  */
        System.out.println("Аргументы командной строки:");
        for(int j = 0; j < args.length; j++) {
            System.out.println("Аргумент " + j + " " + args[j]);
        }
        /*6. Написать программу, в результате работы которой выводятся на экран
        первые 10 чисел гармонического ряда (форматировать вывод).*/
        System.out.println("Выводятся первые 10 чисел гармонического ряда:");
        double num_num = 0;
        for(int j = 1; j <= 10; j++) {
            num_num += 1.0 / j;
            System.out.printf("%2d) =  %.6f%n", j, num_num);
        }
        /*7. Написать программу, которая с помощью метода класса, вычисляет
        факториал числа (использовать управляющую конструкцию цикла), проверить
        работу метода. */
    }
}