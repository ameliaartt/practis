package practice17.z3;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String group;
    Student next;

    public Student() { this("", 0, ""); }

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.next = null;
    }

    public void readFromConsole(Scanner sc) {
        System.out.print("Введите имя: ");
        this.name = sc.nextLine().trim();
        System.out.print("Введите возраст: ");
        while (!sc.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            sc.next();
        }
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Введите группу: ");
        this.group = sc.nextLine().trim();
    }

    public void print() {
        System.out.printf("Имя: %-15s Возраст: %-3d Группа: %-10s%n",
                name, age, group);
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return name + ";" + age + ";" + group;
    }
}