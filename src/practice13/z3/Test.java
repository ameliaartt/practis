package practice13.z3;

public class Test {
    public static void main(String[] args) {
        String[] samples = {
                "Россия, Московская область, Москва, Тверская, 12, 3, 45",
                "Россия, Ленинградская область, Санкт-Петербург, Невский проспект, 28, 1, 10",
                "Беларусь, Минская область, Минск, Независимости, 5, 2, 77",
                "Казахстан, Алматинская область, Алматы, Абая, 100, 4, 12"
        };

        System.out.println("=== Вариант a) split(\",\") ===");
        for (String s : samples) {
            Adress a = new Adress();
            a.parseWithSplit(s);
            System.out.println(a);
        }

        System.out.println("\nВариант б) split с regex [,' ;\\-]+");
        for (String s : samples) {
            Adress a = new Adress();
            a.parseWithRegex(s);
            System.out.println(a);
        }

        // Дополнительно: смешанные разделители в одной строке
        System.out.println("\nСмешанные разделители");
        Adress mixed = new Adress();
        mixed.parseWithRegex("Россия; Московская область ' Москва - Тверская, 12; 3' 45");
        System.out.println(mixed);
    }
}
