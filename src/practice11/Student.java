package practice11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getBirthDateFormatted(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(birthDate);
    }

    public String getBirthDateShort() {
        return DateFormat.getDateInstance(DateFormat.SHORT).format(birthDate);
    }

    public String getBirthDateMedium() {
        return DateFormat.getDateInstance(DateFormat.MEDIUM).format(birthDate);
    }

    public String getBirthDateFull() {
        return DateFormat.getDateInstance(DateFormat.FULL).format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', birthDate=" +
                getBirthDateFormatted("dd.MM.yyyy") + "}";
    }

    public static void main(String[] args) {
        Student s = new Student("Петров Пётр", new Date(90, 4, 15)); // 15 мая 1990

        System.out.println(s);
        System.out.println("Короткий формат: " + s.getBirthDateShort());
        System.out.println("Средний формат:  " + s.getBirthDateMedium());
        System.out.println("Полный формат:   " + s.getBirthDateFull());
        System.out.println("Свой формат:     " + s.getBirthDateFormatted("yyyy-MM-dd"));
    }
}
