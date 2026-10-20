package practice11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class z1 {
    public static void main(String[] args) {
        String developer = "Боровская У.И.";

        Date receivedDate = new Date();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        Date submittedDate = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Разработчик: " + developer);
        System.out.println("Дата и время получения задания: " + sdf.format(receivedDate));
        System.out.println("Дата и время сдачи задания:     " + sdf.format(submittedDate));
    }
}
