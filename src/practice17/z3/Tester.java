package practice17.z3;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Создать пустой список");
            System.out.println("2. Добавить студента");
            System.out.println("3. Удалить студента по имени");
            System.out.println("4. Показать всех");
            System.out.println("5. Очистить список");
            System.out.println("6. Проверить на пустоту");
            System.out.println("7. Сохранить в файл");
            System.out.println("8. Загрузить из файла");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");

            switch (sc.nextLine().trim()) {
                case "1" -> { list.createEmpty(); System.out.println("Список создан."); }
                case "2" -> {
                    Student s = new Student();
                    s.readFromConsole(sc);
                    list.add(s);
                    System.out.println("Добавлено.");
                }
                case "3" -> {
                    System.out.print("Имя: ");
                    System.out.println(list.removeByName(sc.nextLine().trim())
                            ? "Удалено." : "Не найдено.");
                }
                case "4" -> list.printAll();
                case "5" -> { list.clear(); System.out.println("Очищено."); }
                case "6" -> System.out.println(list.isEmpty()
                        ? "Пусто." : "Элементов: " + list.getSize());
                case "7" -> {
                    System.out.print("Файл: ");
                    try { list.saveToFile(sc.nextLine().trim()); System.out.println("OK."); }
                    catch (Exception e) { System.out.println("Ошибка: " + e.getMessage()); }
                }
                case "8" -> {
                    System.out.print("Файл: ");
                    try { list.loadFromFile(sc.nextLine().trim()); System.out.println("OK."); }
                    catch (Exception e) { System.out.println("Ошибка: " + e.getMessage()); }
                }
                case "0" -> exit = true;
                default -> System.out.println("Неверный выбор.");
            }
        }
        sc.close();
    }
}
