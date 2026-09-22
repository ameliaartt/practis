package practice2.zd1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        System.out.println("Введите данные об авторе:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя:");
        String name = scanner.next();
        System.out.print("Почта:");
        String email = scanner.next();
        System.out.print("Пол:");
        char gender = scanner.next().charAt(0);
        Author author1 = new Author(name, email, gender);
        System.out.println("Имя автора:" + author1.getName());
        System.out.println("Почта автора:" + author1.getEmail());
        System.out.println("Пол:" + author1.getGender());
        System.out.print("Смените почту:");
        String email2 = scanner.next();
        author1.setEmail(email2);
        System.out.println(author1.toString());
        scanner.close();

    }
}
