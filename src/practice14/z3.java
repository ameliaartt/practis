package practice14;

import java.util.regex.*;

public class z3 {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 100 RUB, 44 ERR, 0.004 EU, 12.5 EU, 7 RUB.";
        Pattern p = Pattern.compile("\\b\\d+(\\.\\d{1,2})?\\s+(USD|RUB|EU)\\b");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println("Найдена цена: " + m.group());
        }
    }
}