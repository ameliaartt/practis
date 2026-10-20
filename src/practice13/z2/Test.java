package practice13.z2;

public class Test {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        System.out.println("=== Тестирование класса Person ===\n");

        check("Петров И.С.",
                new Person("Иван", "Петров", "Сергеевич").getFullName());
        check("Петров И.",
                new Person("Иван", "Петров", null).getFullName());
        check("Петров С.",
                new Person(null, "Петров", "Сергеевич").getFullName());
        check("Петров",
                new Person(null, "Петров", null).getFullName());
        check("Петров",
                new Person("", "Петров", "").getFullName());
        check("Петров И.",
                new Person("Иван", "Петров", "").getFullName());
        check("Петров С.",
                new Person("", "Петров", "Сергеевич").getFullName());
        check("Я И.С.",
                new Person("Иван", "Я", "Сергеевич").getFullName());
        check("Петров И.С.",
                new Person("И", "Петров", "С").getFullName());
        check("Константинопольский А.В.",
                new Person("Александр", "Константинопольский", "Васильевич").getFullName());
        check("Smith J.R.",
                new Person("John", "Smith", "Robert").getFullName());
        String result = new Person("Иван", "Петров", "Сергеевич").getFullName();
        check("Петров И.С.", result);
        check("нет двойных пробелов", String.valueOf(!result.contains("  ")));
        System.out.println("\nИтог: passed=" + passed + ", failed=" + failed);
        if (failed > 0) {
            System.exit(1);
        }
    }
    private static void check(String expected, String actual) {
        if (expected.equals(actual)) {
            passed++;
            System.out.println("[OK]   ожидалось: \"" + expected + "\" | получено: \"" + actual + "\"");
        } else {
            failed++;
            System.out.println("[FAIL] ожидалось: \"" + expected + "\" | получено: \"" + actual + "\"");
        }
    }
}
