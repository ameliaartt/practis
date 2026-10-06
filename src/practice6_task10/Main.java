package practice6_task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.print("Сколько компьютеров добавить? ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\n Компьютер №" + (i + 1));
            Computer c = new Computer();
            c.input(scanner);
            shop.add(c);
        }

        System.out.println("\nВсе компьютеры:");
        shop.showAll();

        System.out.print("\nВведите марку для поиска: ");
        Brand brand = Brand.valueOf(scanner.nextLine().toUpperCase());
        shop.search(brand);

        System.out.print("\nВведите индекс для удаления: ");
        shop.remove(Integer.parseInt(scanner.nextLine()));

        System.out.println("\nПосле удаления:");
        shop.showAll();

        scanner.close();
    }
}