package practice3.z23;

public class ReportTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван", 75000.5),
                new Employee("Петров Пётр", 120000.0),
                new Employee("Сидорова Анна", 95450.75),
                new Employee("Кузнецов Дмитрий", 88200.33)
        };

        Report.generateReport(employees);
    }
}
