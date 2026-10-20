package practice11;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class z4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Введите число: ");
        int day = scanner.nextInt();
        System.out.print("Введите часы (0-23): ");
        int hour = scanner.nextInt();
        System.out.print("Введите минуты: ");
        int minute = scanner.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.HOUR_OF_DAY, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        Date dateFromCal = cal.getTime();
        System.out.println("Calendar → Date: " + sdf.format(dateFromCal));

        Date dateFromMillis = new Date(cal.getTimeInMillis());
        System.out.println("Date(long):      " + sdf.format(dateFromMillis));

        scanner.close();
    }
}
