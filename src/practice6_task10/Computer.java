package practice6_task10;

import java.util.Scanner;

public class Computer {
    Brand brand;
    Processor processor = new Processor();
    Memory memory = new Memory();
    Monitor monitor = new Monitor();
    double price;

    public void input(Scanner scanner) {
        System.out.print("Марка (APPLE/ASUS/LENOVO/HP/DELL): ");
        brand = Brand.valueOf(scanner.nextLine().toUpperCase());

        processor.input(scanner);
        memory.input(scanner);
        monitor.input(scanner);

        System.out.print("Цена: ");
        price = Double.parseDouble(scanner.nextLine());
    }

    public String toString() {
        return "Компьютер " + brand + "\n  " + processor +
                "\n  " + memory + "\n  " + monitor +
                "\n  Цена: " + price + " руб.";
    }
}
