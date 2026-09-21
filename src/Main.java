import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 23;
        /*String ss = "Hello";
        String s1 = new String("Mirea");
        Scanner scanner = new Scanner(System.in);
        System.out.print("x =");
        x = scanner.nextInt();
        System.out.print("y =");
        y = scanner.nextInt();
        System.out.println(x + y);
        System.out.println(s1 + ss + '\'' + '\n' + '\"' + '\t')
        System.out.println("Hello, World!" + "jifh" + x + y); */

        /*3. Написать программу, в результате которой массив чисел создается с
        помощью инициализации (как в Си) вводится и считается в цикле сумма
        элементов целочисленного массива, а также среднее арифметическое его
        элементов результат выводится на экран. Использовать цикл for. */
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
        максимальный и минимальный элемент в массиве, результат выводится на экран.
        5. Написать программу, в результате которой выводятся на экран
        аргументы командной строки в цикле for.  */
        Scanner scanner = new Scanner(System.in);
        System.out.print("n =");
        int n = scanner.nextInt();
        int[] array2 = new int[n];
        int res2 = 0;
        for(int i = 0; i < 10; i++) {
            res += array1[i];
        }
        System.out.println("summ = " + res);
        System.out.println("arith. mean = " + (res / 10));
        for(int i = 0; i < 10; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}