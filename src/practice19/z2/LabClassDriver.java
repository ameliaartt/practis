package practice19.z2;

public class LabClassDriver {
    public static void main(String[] args) {
        LabClass labClass = new LabClass();
        labClass.addStudent(new Student("Иванов Иван", 4.5));
        labClass.addStudent(new Student("Петров Пётр", 3.8));
        labClass.addStudent(new Student("Сидорова Анна", 4.9));

        new LabClassUI(labClass).start();
    }
}
