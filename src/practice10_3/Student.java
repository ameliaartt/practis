package practice10_3;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private int idNumber;
    private double gpa;

    public Student(String firstName, String lastName, String specialty,
                   int course, String group, int idNumber, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    public int getCourse() { return course; }
    public void setCourse(int course) { this.course = course; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public int getIdNumber() { return idNumber; }
    public void setIdNumber(int idNumber) { this.idNumber = idNumber; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return String.format("ID:%-4d %-12s %-12s | %-15s | курс %d, гр. %-8s | GPA: %.2f",
                idNumber, lastName, firstName, specialty, course, group, gpa);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return idNumber == s.idNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNumber);
    }
}