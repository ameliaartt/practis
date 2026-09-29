package practice2.zd10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");
        if (input.trim().isEmpty()) {
            System.out.println("Вы ввели 0 слов.");
        } else {
            System.out.println("Вы ввели " + words.length + " слов.");
        }
    }
}
