package practice3.z1;

import java.util.Random;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        double [] array1 = new double[10];
        double[] array2 = new double[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++){
            array1[i] = random.nextDouble();
            array2[i] = Math.random();
        }

        System.out.print("Изначальный массив1: ");
        for (double n : array1){
            System.out.print(n + " ");
        }
        System.out.print('\n');
        System.out.print("Изначальный массив2: ");
        for (double n : array2){
            System.out.print(n + " ");
        }
        System.out.print('\n');

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.print("Отсортированный массив1: ");
        for (double n : array1){
            System.out.print(n + " ");
        }
        System.out.print('\n');
        System.out.print("Отсортированный массив2: ");
        for (double n : array2){
            System.out.print(n + " ");
        }
        System.out.print('\n');
    }
}
