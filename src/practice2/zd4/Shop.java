package practice2.zd4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Computer> comps = new ArrayList<>();

    public void addComputer(Computer c) {
        comps.add(c);
    }

    public void removeComputer(String name) {
        comps.removeIf(c -> c.getName().equalsIgnoreCase(name));
    }

    public Computer findComputer(String name) {
        for (Computer c : comps) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        System.out.println("Введите данные о компьютере, который хотите добавить:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Название:");
        String name1 = scanner.nextLine();
        System.out.print("Объём RAM:");
        int ram1 = scanner.nextInt();
        scanner.nextLine();
        shop.addComputer(new Computer(name1, ram1));
        System.out.println("Введите данные о компьютере, который хотите добавить:");
        System.out.print("Название:");
        String name2 = scanner.nextLine();
        System.out.print("Объём RAM:");
        int ram2 = scanner.nextInt();
        scanner.nextLine();
        shop.addComputer(new Computer(name2, ram2));

        System.out.println("Введите название компьютера, который хотите найти:");
        System.out.print("Название:");
        String name3 = scanner.nextLine();
        System.out.println("Поиск: " + shop.findComputer(name3));
        System.out.println("Введите название компьютера, который хотите удалить:");
        System.out.print("Название:");
        String name4 = scanner.nextLine();
        shop.removeComputer(name4);
        System.out.println("После удаления: " + shop.findComputer(name4));
    }
}
