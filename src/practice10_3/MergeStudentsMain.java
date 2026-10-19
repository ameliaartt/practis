package practice10_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeStudentsMain {
    public static List<Student> mergeSortedLists(List<Student> list1,
                                                 List<Student> list2,
                                                 Comparator<Student> cmp) {
        List<Student> result = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (cmp.compare(list1.get(i), list2.get(j)) <= 0) {
                result.add(list1.get(i++));
            } else {
                result.add(list2.get(j++));
            }
        }
        while (i < list1.size()) result.add(list1.get(i++));
        while (j < list2.size()) result.add(list2.get(j++));

        return result;
    }

    public static List<Student> mergeAndSort(List<Student> list1,
                                             List<Student> list2,
                                             Comparator<Student> cmp) {
        List<Student> a = new ArrayList<>(list1);
        List<Student> b = new ArrayList<>(list2);
        a.sort(cmp);
        b.sort(cmp);
        return mergeSortedLists(a, b, cmp);
    }

    public static void printList(String title, List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Student> group1 = new ArrayList<>();
        group1.add(new Student("Tom",   "Smith",   "Информатика", 2, "IT-21", 101, 4.5));
        group1.add(new Student("Anna",  "Ivanova", "Математика",  1, "MT-11", 102, 3.9));
        group1.add(new Student("Nick",  "Brown",   "Физика",      3, "PH-31", 103, 4.8));

        List<Student> group2 = new ArrayList<>();
        group2.add(new Student("Bill",  "Jones",   "Информатика", 2, "IT-21", 201, 4.1));
        group2.add(new Student("Kate",  "Petrova", "Математика",  1, "MT-11", 202, 5.0));
        group2.add(new Student("Alex",  "Green",   "Физика",      3, "PH-31", 203, 3.5));

        Comparator<Student> byGpa = new StudentGpaComparator();

        group1.sort(byGpa);
        group2.sort(byGpa);

        printList("Список 1 (отсортирован по GPA ↓)", group1);
        printList("Список 2 (отсортирован по GPA ↓)", group2);

        List<Student> merged = mergeSortedLists(group1, group2, byGpa);
        printList("Объединённый отсортированный список (по GPA ↓)", merged);

        Comparator<Student> byLastName =
                Comparator.comparing(Student::getLastName);
        List<Student> mergedByLastName = mergeAndSort(group1, group2, byLastName);
        printList("Объединённый список (по фамилии A→Z)", mergedByLastName);

        Comparator<Student> bySpecialtyThenGpa =
                Comparator.comparing(Student::getSpecialty)
                        .thenComparing(byGpa);
        List<Student> mergedComplex = mergeAndSort(group1, group2, bySpecialtyThenGpa);
        printList("Объединённый список (специальность, затем GPA ↓)", mergedComplex);
    }
}
