package practice21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static List<String> listDirectory(String path) {
        List<String> result = new ArrayList<>();
        File dir = new File(path);
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                result.add(f.getName());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> content = listDirectory(".");

        System.out.println("Всего элементов: " + content.size());
        System.out.println("Первые 5 элементов:");
        content.stream()
                .limit(5)
                .forEach(System.out::println);
    }
}
