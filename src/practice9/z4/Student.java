package practice9.z4;

class Student implements Comparable<Student> {
    private int iDNumber;
    private String name;
    private double gpa;

    public Student(int iDNumber, String name, double gpa) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public int getiDNumber() { return iDNumber; }
    public String getName()   { return name; }
    public double getGpa()    { return gpa; }


    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.iDNumber, other.iDNumber);
    }

    @Override
    public String toString() {
        return "Student{id=" + iDNumber + ", name='" + name + "', gpa=" + gpa + "}";
    }
}
