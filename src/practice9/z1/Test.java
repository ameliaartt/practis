package practice9.z1;

public class Test {
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].getiDNumber() > key.getiDNumber()) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
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

        System.out.println("До сортировки:");
        for (Student s : students) System.out.println(s);

        insertionSort(students);

        System.out.println("\nПосле сортировки вставками по iDNumber:");
        for (Student s : students) System.out.println(s);
    }
}
