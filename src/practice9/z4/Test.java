package practice9.z4;

import java.util.Arrays;

public class Test {
    public static void selectionSort(Comparable[] list) {
        for (int index = 0; index < list.length - 1; index++) {
            int min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }
            Comparable temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(5, "Анна",   4.5),
                new Student(2, "Борис",  3.8),
                new Student(9, "Виктор", 4.9),
                new Student(1, "Галина", 3.2),
                new Student(4, "Дмитрий",4.1),
        };

        selectionSort(students);

        System.out.println("Сортировка по iDNumber (через Comparable):");
        for (Student s : students) System.out.println(s);

        Arrays.sort(students);
    }
}
