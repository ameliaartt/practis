package practice6_task10;

import java.util.Scanner;

public class Processor {
    String model;
    int cores;

    public void input(Scanner scanner) {
        System.out.print("Модель процессора: ");
        model = scanner.nextLine();
        System.out.print("Количество ядер: ");
        cores = Integer.parseInt(scanner.nextLine());
    }

    public String toString() {
        return "Процессор: " + model + ", " + cores + " ядер";
    }
}
