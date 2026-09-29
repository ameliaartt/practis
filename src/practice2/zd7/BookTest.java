package practice2.zd7;

import java.util.Scanner;
public class BookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookShelf shelf = new BookShelf();
        System.out.println("Введите данные книги, которую хотите добавить:");
        System.out.print("Автор: ");
        String author1 = scanner.nextLine();
        System.out.print("Название: ");
        String title1 = scanner.nextLine();
        System.out.print("Год издания: ");
        int year1 = scanner.nextInt();
        scanner.nextLine();
        shelf.addBook(new Book(author1, title1, year1));

        System.out.println("Введите данные книги, которую хотите добавить:");
        System.out.print("Автор: ");
        String author2 = scanner.nextLine();
        System.out.print("Название: ");
        String title2 = scanner.nextLine();
        System.out.print("Год издания: ");
        int year2 = scanner.nextInt();
        scanner.nextLine();
        shelf.addBook(new Book(author2, title2, year2));

        System.out.println("Введите данные книги, которую хотите добавить:");
        System.out.print("Автор: ");
        String author3 = scanner.nextLine();
        System.out.print("Название: ");
        String title3 = scanner.nextLine();
        System.out.print("Год издания: ");
        int year3 = scanner.nextInt();
        scanner.nextLine();
        shelf.addBook(new Book(author3, title3, year3));


        System.out.println("\nСамая поздняя книга: " + shelf.getLatest());
        System.out.println("Самая ранняя книга: " + shelf.getEarliest());

        shelf.sortByYear();
        System.out.println("\nОтсортированный список:");
        shelf.printAll();
    }
}
