package practice14;

import java.util.regex.*;

public class z5 {
    private static final Pattern DATE = Pattern.compile(
            "^(?:" +
                    "(0[1-9]|[12]\\d|3[01])/(0[13578]|1[02])/(19\\d{2}|[2-9]\\d{3})" + "|" +
                    "(0[1-9]|[12]\\d|30)/(0[469]|11)/(19\\d{2}|[2-9]\\d{3})" + "|" +
                    "(0[1-9]|[12]\\d)/(02)/(19\\d{2}|[2-9]\\d{3})" + "|" +
                    "29/02/(19\\d{2}|[2-9]\\d{3})" +
                    ")$"
    );

    static boolean isLeap(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    static boolean isValidDate(String s) {
        Matcher m = DATE.matcher(s);
        if (!m.matches()) return false;
        if (s.startsWith("29/02/")) {
            int year = Integer.parseInt(s.substring(6));
            return isLeap(year);
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {
                "29/02/2000", "30/04/2003", "01/01/2003",
                "29/02/2001", "30-04-2003", "1/1/1899",
                "31/04/2020", "29/02/1900", "29/02/2024"
        };
        for (String t : tests) {
            System.out.println(t + " -> " + (isValidDate(t) ? "корректна" : "некорректна"));
        }
    }
}
