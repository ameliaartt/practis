package practice14;

import java.util.regex.*;

public class z4 {
    public static void main(String[] args) {
        String[] tests = {
                "(1 + 8) – 9 / 4",
                "6 / 5 – 2 * 9",
                "1 + 2 + 3"
        };
        Pattern p = Pattern.compile("\\d+(?!\\s*\\+)");
        for (String t : tests) {
            Matcher m = p.matcher(t);
            System.out.print("Текст: " + t + " -> цифры без '+': ");
            boolean found = false;
            while (m.find()) {
                System.out.print("[" + m.group() + "] ");
                found = true;
            }
            System.out.println(found ? "" : "нет");
        }
    }
}