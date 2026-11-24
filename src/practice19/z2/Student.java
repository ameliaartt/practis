package practice19.z2;

public class Student implements Comparable<Student> {
    private String fullName;
    private double averageMark;

    public Student(String fullName, double averageMark) {
        this.fullName = fullName;
        this.averageMark = averageMark;
    }

    public String getFullName() { return fullName; }
    public double getAverageMark() { return averageMark; }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.averageMark, o.averageMark);
    }

    @Override
    public String toString() {
        return String.format("%s (средний балл: %.2f)", fullName, averageMark);
    }
}
