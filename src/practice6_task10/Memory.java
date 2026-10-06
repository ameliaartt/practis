package practice6_task10;

import java.util.Scanner;

public class Memory {
    String type;
    int size;

    public void input(Scanner scanner) {
        System.out.print("Тип памяти (DDR4/SSD): ");
        type = scanner.nextLine();
        System.out.print("Объём (ГБ): ");
        size = Integer.parseInt(scanner.nextLine());
    }

    public String toString() {
        return "Память: " + type + ", " + size + " ГБ";
    }
}
