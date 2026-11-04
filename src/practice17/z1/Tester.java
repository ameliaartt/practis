package practice17.z1;

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

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1":
                    list.createEmpty();
                    System.out.println("Список создан (пуст).");
                    break;
                case "2":
                    Student s = new Student();
                    s.readFromConsole(sc);
                    list.add(s);
                    System.out.println("Студент добавлен.");
                    break;
                case "3":
                    System.out.print("Имя для удаления: ");
                    String nm = sc.nextLine().trim();
                    System.out.println(list.removeByName(nm)
                            ? "Удалено." : "Не найдено.");
                    break;
                case "4":
                    list.printAll();
                    break;
                case "5":
                    list.clear();
                    System.out.println("Список очищен.");
                    break;
                case "6":
                    System.out.println(list.isEmpty()
                            ? "Список пуст." : "Список не пуст. Элементов: " + list.getSize());
                    break;
                case "7":
                    System.out.print("Имя файла: ");
                    try {
                        list.saveToFile(sc.nextLine().trim());
                        System.out.println("Сохранено.");
                    } catch (Exception e) {
                        System.out.println("Ошибка сохранения: " + e.getMessage());
                    }
                    break;
                case "8":
                    System.out.print("Имя файла: ");
                    try {
                        list.loadFromFile(sc.nextLine().trim());
                        System.out.println("Загружено.");
                    } catch (Exception e) {
                        System.out.println("Ошибка загрузки: " + e.getMessage());
                    }
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Неверный выбор.");
            }
        }
        sc.close();
    }
}
