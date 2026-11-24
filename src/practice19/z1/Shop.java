package practice19.z1;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ФИО: ");
        String fio = sc.nextLine();
        System.out.print("Введите ИНН: ");
        String inn = sc.nextLine();

        Client client = new Client(fio, inn);
        try {
            INNValidator.validate(client);
            System.out.println("Заказ оформлен для " + client.getFullName());
        } catch (InvalidINNException e) {
            System.err.println("Ошибка оформления заказа: " + e.getMessage());
        }
    }
}
