package practice17.z2;

import java.io.*;
import java.util.Scanner;

public class StudentList {
    private Student head;
    private Student tail;
    private int size;

    public StudentList() {
        createEmpty();
    }

    public void createEmpty() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(Student s) {
        s.prev = null;
        s.next = null;
        if (head == null) {
            head = tail = s;
        } else {
            s.prev = tail;
            tail.next = s;
            tail = s;
        }
        size++;
    }

    public boolean removeByName(String name) {
        Student cur = head;
        while (cur != null) {
            if (cur.getName().equalsIgnoreCase(name)) {
                if (cur.prev != null) cur.prev.next = cur.next;
                else                  head = cur.next;

                if (cur.next != null) cur.next.prev = cur.prev;
                else                  tail = cur.prev;

                cur.prev = cur.next = null;
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
        tail = null;
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
                String[] p = line.split(";");
                if (p.length == 3) {
                    try {
                        add(new Student(p[0], Integer.parseInt(p[1]), p[2]));
                    } catch (NumberFormatException ignored) { }
                }
            }
        }
    }
}