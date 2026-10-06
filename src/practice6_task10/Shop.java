package practice6_task10;

import java.util.ArrayList;

public class Shop {
    ArrayList<Computer> computers = new ArrayList<>();

    public void add(Computer c) {
        computers.add(c);
        System.out.println("Компьютер добавлен.");
    }

    public void remove(int index) {
        if (index >= 0 && index < computers.size()) {
            computers.remove(index);
            System.out.println("Компьютер удалён.");
        } else {
            System.out.println("Неверный индекс.");
        }
    }

    public void search(Brand brand) {
        System.out.println("Результат поиска:");
        boolean found = false;
        for (Computer c : computers) {
            if (c.brand == brand) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) System.out.println("Ничего не найдено.");
    }

    public void showAll() {
        for (int i = 0; i < computers.size(); i++) {
            System.out.println("[" + i + "] " + computers.get(i));
        }
    }
}
