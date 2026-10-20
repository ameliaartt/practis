package practice13;

public class z1 {

    public static void processString(String str) {
        // 1. Исходная строка
        System.out.println("1. Исходная строка: " + str);

        // 2. Последний символ
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("2. Последний символ: " + lastChar);

        // 3. Заканчивается ли на "!!!"
        boolean endsWith = str.endsWith("!!!");
        System.out.println("3. Заканчивается на \"!!!\": " + endsWith);

        // 4. Начинается ли на "I like"
        boolean startsWith = str.startsWith("I like");
        System.out.println("4. Начинается на \"I like\": " + startsWith);

        // 5. Содержит ли "Java"
        boolean contains = str.contains("Java");
        System.out.println("5. Содержит \"Java\": " + contains);

        // 6. Позиция подстроки "Java"
        int pos = str.indexOf("Java");
        System.out.println("6. Позиция \"Java\": " + pos);

        // 7. Заменить все 'a' на 'o'
        String replaced = str.replace('a', 'o');
        System.out.println("7. Замена 'a' на 'o': " + replaced);

        // 8. В верхний регистр
        String upper = str.toUpperCase();
        System.out.println("8. Верхний регистр: " + upper);

        // 9. В нижний регистр
        String lower = str.toLowerCase();
        System.out.println("9. Нижний регистр: " + lower);

        // 10. Вырезать "Java"
        int start = str.indexOf("Java");
        int end = start + "Java".length();
        String cut = str.substring(0, start) + str.substring(end);
        System.out.println("10. Без \"Java\": " + cut);
    }

    public static void main(String[] args) {
        processString("I like Java!!!");
    }
}