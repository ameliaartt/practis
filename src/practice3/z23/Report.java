package practice3.z23;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("=====================================================");
        System.out.printf("%-30s | %15s%n", "Сотрудник", "Зарплата");
        System.out.println("=====================================================");
        for (Employee e : employees) {
            System.out.printf("%-30s | %15.2f руб.%n", e.getName(), e.getSalary());
        }
        System.out.println("=====================================================");
    }
}