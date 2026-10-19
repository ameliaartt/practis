package practice9.z2;

import java.util.Comparator;
import practice9.z1.Student;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa());
    }
}
