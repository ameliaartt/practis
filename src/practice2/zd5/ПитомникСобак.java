package practice2.zd5;

import java.util.Scanner;

public class ПитомникСобак {
    public static void main(String[] args) {
        System.out.println("Введите данные собаке, которую хотите добавить:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Кличка: ");
        String name1 = scanner.nextLine();
        System.out.print("Возраст: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();
        Dog dog1 = new Dog(name1, age1);

        System.out.println("Введите данные собаке, которую хотите добавить:");
        System.out.print("Кличка: ");
        String name2 = scanner.nextLine();
        System.out.print("Возраст: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();
        Dog dog2 = new Dog(name2, age2);

        System.out.println(dog1.getName() + "в человеческом возрасте: " + dog1.getHumanAge());
        System.out.println(dog2.getName() + "в человеческом возрасте: " + dog2.getHumanAge());
    }
}

