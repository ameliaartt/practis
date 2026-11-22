package practice9.z3;

public class MergeSortStudents {

    public static void mergeSort(Comparable[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(Comparable[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Comparable[] L = new Comparable[n1];
        Comparable[] R = new Comparable[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= 0) arr[k++] = L[i++];
            else                            arr[k++] = R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static Student[] mergeTwoSorted(Student[] a, Student[] b) {
        Student[] result = new Student[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) <= 0) result[k++] = a[i++];
            else                            result[k++] = b[j++];
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }

    public static void main(String[] args) {
        Student[] list1 = {
                new Student(101, "Иванов", 4.5),
                new Student(103, "Петров", 3.8),
                new Student(105, "Сидоров", 4.9)
        };
        Student[] list2 = {
                new Student(102, "Кузнецов", 4.1),
                new Student(104, "Смирнов", 3.5),
                new Student(106, "Орлов", 4.7)
        };

        //слить два уже отсортированных массива
        Student[] merged = mergeTwoSorted(list1, list2);
        System.out.println("Слияние двух отсортированных списков:");
        for (Student s : merged) System.out.println(s);

        //полная сортировка слиянием объединённого массива
        Student[] all = new Student[list1.length + list2.length];
        System.arraycopy(list1, 0, all, 0, list1.length);
        System.arraycopy(list2, 0, all, list1.length, list2.length);

        mergeSort(all, 0, all.length - 1);
        System.out.println("\nПолная сортировка слиянием:");
        for (Student s : all) System.out.println(s);
    }
}
