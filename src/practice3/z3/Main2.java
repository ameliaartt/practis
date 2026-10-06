package practice3.z3;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        int [] array1 = new int[4];

        Random random = new Random();

        boolean flag = true;
        int prev = 0;

        for (int i = 0; i < 4; i++){
            array1[i] = random.nextInt(10, 100);
            if (prev > array1[i]){
                flag = false;
            }
            prev = array1[i];
        }

        System.out.print("Массив: ");
        for (double n : array1){
            System.out.print(n + ", ");
        }
        System.out.print('\n');
        if (flag){
            System.out.print("Массив  строго возрастающая последовательность");
        }
        else{
            System.out.print("Массив не строго возрастающая последовательность");
        }


    }
}
