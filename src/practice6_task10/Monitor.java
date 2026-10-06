package practice6_task10;

import java.util.Scanner;

public class Monitor {
    String model;
    double diagonal;

    public void input(Scanner scanner) {
        System.out.print("Модель монитора: ");
        model = scanner.nextLine();
        System.out.print("Диагональ (дюймы): ");
        diagonal = Double.parseDouble(scanner.nextLine());
    }

    public String toString() {
        return "Монитор: " + model + ", " + diagonal + "\"";
    }
}