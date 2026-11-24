package practice19.z2;

import java.util.Scanner;

public class LabClassUI {

    private interface Action {
        void run() throws Exception;
    }

    private final LabClass labClass;
    private final Scanner sc = new Scanner(System.in);

    public LabClassUI(LabClass labClass) { this.labClass = labClass; }

    public void start() {
        Action[] actions = {
                () -> { labClass.sortByAverageMark();
                    System.out.println("Отсортировано:");
                    labClass.getStudents().forEach(System.out::println); },
                () -> { System.out.print("Введите ФИО для поиска: ");
                    String name = sc.nextLine();
                    System.out.println("Найден: " + labClass.findByFullName(name)); },
                () -> System.exit(0)
        };

        while (true) {
            System.out.println("\n1 - Сортировать по среднему баллу");
            System.out.println("2 - Найти студента по ФИО");
            System.out.println("0 - Выход");
            System.out.print("Выбор: ");
            String choice = sc.nextLine();

            int idx = choice.equals("1") ? 0 : choice.equals("2") ? 1 : 2;
            try {
                actions[idx].run();
            } catch (StudentNotFoundException e) {
                System.err.println("Ошибка поиска: " + e.getMessage());
            } catch (EmptyStringException e) {
                System.err.println("Ошибка ввода: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Непредвиденная ошибка: " + e.getMessage());
            }
        }
    }
}
