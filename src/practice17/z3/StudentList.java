package practice17.z3;

import java.io.*;
import java.util.Scanner;

public class StudentList {
    private Student tail;
    private int size;

    public StudentList() {
        createEmpty();
    }

    public void createEmpty() {
        tail = null;
        size = 0;
    }

    public void add(Student s) {
        if (tail == null) {
            tail = s;
            s.next = s;
        } else {
            s.next = tail.next;
            tail.next = s;
            tail = s;
        }
        size++;
    }

    public boolean removeByName(String name) {
        if (tail == null) return false;

        Student cur = tail.next;
        Student prev = tail;

        if (size == 1) {
            if (cur.getName().equalsIgnoreCase(name)) {
                tail = null;
                cur.next = null;
                size = 0;
                return true;
            }
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (cur.getName().equalsIgnoreCase(name)) {
                prev.next = cur.next;
                if (cur == tail) tail = prev;
                cur.next = null;
                size--;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }
        return false;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Список пуст.");
            return;
        }
        Student cur = tail.next; // первый
        int i = 1;
        do {
            System.out.print(i++ + ". ");
            cur.print();
            cur = cur.next;
        } while (cur != tail.next);
        System.out.println("Всего записей: " + size);
    }

    public void clear() {
        if (tail != null) {
            Student cur = tail.next;
            for (int i = 0; i < size; i++) {
                Student nxt = cur.next;
                cur.next = null;
                cur = nxt;
            }
        }
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public int getSize() { return size; }

    public void saveToFile(String fileName) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            if (tail == null) return;
            Student cur = tail.next;
            do {
                bw.write(cur.toString());
                bw.newLine();
                cur = cur.next;
            } while (cur != tail.next);
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
