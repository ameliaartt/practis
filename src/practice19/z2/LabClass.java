package practice19.z2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabClass {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) { students.add(s); }

    public void sortByAverageMark() {
        Collections.sort(students);
        Collections.reverse(students);
    }

    public Student findByFullName(String fullName)
            throws StudentNotFoundException, EmptyStringException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new EmptyStringException("ФИО не может быть пустым");
        }
        for (Student s : students) {
            if (s.getFullName().equalsIgnoreCase(fullName.trim())) {
                return s;
            }
        }
        throw new StudentNotFoundException(
                "Студент с ФИО \"" + fullName + "\" не найден");
    }

    public List<Student> getStudents() { return students; }
}
