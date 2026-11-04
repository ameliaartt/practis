package practice17.z1;

import java.io.*;
import java.util.Scanner;

public class StudentList {
    private Student head;
    private int size;

    public StudentList() {
        createEmpty();
    }

    public void createEmpty() {
        head = null;
        size = 0;
    }

    public void add(Student s) {
        s.next = null;
        if (head == null) {
            head = s;
        }
        else {
            Student cur = head;
            while (cur.next != null){
                cur = cur.next;
                cur.next = s;
            }
        }
        size++;
    }

    public boolean removeByName(String name) {
        if (head == null) return false;
        if (head.getName().equalsIgnoreCase(name)) {
            head = head.next;
            size--;
            return true;
        }
        Student cur = head;
        while (cur.next != null) {
            if (cur.next.getName().equalsIgnoreCase(name)) {
                cur.next = cur.next.next;
                size--;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Student cur = head;
        int i = 1;
        while (cur != null) {
            System.out.print(i++ + ". ");
            cur.print();
            cur = cur.next;
        }
        System.out.println("Всего записей: " + size);
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() { return size; }

    public void saveToFile(String fileName) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            Student cur = head;
            while (cur != null) {
                bw.write(cur.toString());
                bw.newLine();
                cur = cur.next;
            }
        }
    }

    public void loadFromFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    try {
                        add(new Student(parts[0],
                                Integer.parseInt(parts[1]), parts[2]));
                    } catch (NumberFormatException ignored) { }
                }
            }
        }
    }
}
