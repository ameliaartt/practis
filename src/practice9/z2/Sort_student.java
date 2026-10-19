package practice9.z2;

import practice9.z1.Student;
import java.util.Comparator;

public class Sort_student {
    public static void quickSort(Student[] arr, int low, int high,
                                 Comparator<Student> cmp) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high, cmp);
            quickSort(arr, low, pivotIndex - 1, cmp);
            quickSort(arr, pivotIndex + 1, high, cmp);
        }
    }

    private static int partition(Student[] arr, int low, int high,
                                 Comparator<Student> cmp) {
        Student pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (cmp.compare(arr[j], pivot) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(Student[] arr, int i, int j) {
        Student tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(5, "Анна",   4.5),
                new Student(2, "Борис",  3.8),
                new Student(9, "Виктор", 4.9),
                new Student(1, "Галина", 3.2),
                new Student(4, "Дмитрий",4.1),
                new Student(7, "Елена",  4.7)
        };

        SortingStudentsByGPA cmp = new SortingStudentsByGPA();
        quickSort(students, 0, students.length - 1, cmp);

        System.out.println("Студенты по GPA (убывание):");
        for (Student s : students) System.out.println(s);
    }
}
