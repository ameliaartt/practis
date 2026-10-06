package practice3.z4;

import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = 0;
        while (true) {
            if (scanner.hasNextInt()){
                n = scanner.nextInt();
                if (n >= 0){
                    break;
                }
                else {
                    System.out.print("Введите натуральное число: ");
                    scanner.next();
                }
            }
            else{
                System.out.print("Введите натуральное число: ");
                scanner.next();
            }
        }

        int [] array1 = new int[n];
        int even_col = 0;
        Random random = new Random();

        for (int i = 0; i < n; i++){
            array1[i] = random.nextInt(0, n);
            if (array1[i] % 2 == 0){
                even_col += 1;
            }
        }

        System.out.print("Массив: ");
        for (int j : array1){
            System.out.print(j + " ");
        }
        System.out.print('\n');

        if (even_col > 0){
            int [] array2 = new int[even_col];
            int k = 0;
            for (int j : array1){
                if (j % 2 == 0){
                    array2[k] = j;
                    k += 1;
                }
            }
            System.out.print("Массив чётных: ");
            for (int j : array2){
                System.out.print(j + " ");
            }
            System.out.print('\n');
        }
        else{
            System.out.print("Чётных чисел нет");
        }


    }
}
