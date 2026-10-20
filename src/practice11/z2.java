package practice11;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class z2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        sdf.setLenient(false);

        System.out.print("Введите дату и время (dd.MM.yyyy HH:mm): ");
        String input = scanner.nextLine();

        try {
            Date userDate = sdf.parse(input);
            Date now = new Date();

            System.out.println("Текущее время:        " + sdf.format(now));
            System.out.println("Введённая дата:       " + sdf.format(userDate));

            int cmp = userDate.compareTo(now);
            if (cmp < 0) {
                System.out.println("Введённая дата меньше текущей (в прошлом).");
            } else if (cmp > 0) {
                System.out.println("Введённая дата больше текущей (в будущем).");
            } else {
                System.out.println("Даты равны.");
            }

            System.out.println("before(now): " + userDate.before(now));
            System.out.println("after(now):  " + userDate.after(now));

        } catch (ParseException e) {
            System.out.println("Ошибка формата даты: " + e.getMessage());
        }

        scanner.close();
    }
}
