package practice13.z3;

import java.util.regex.Pattern;

public class Adress {
    private String country, region, city, street, house, building, apartment;

    public Adress() {}

    public void parseWithSplit(String source) {
        String[] parts = source.split(",", -1);
        assign(parts);
    }
    public void parseWithRegex(String source) {
        String[] parts = source.split("[,' ;\\-]+");
        assign(parts);
    }

    private void assign(String[] parts) {
        country   = get(parts, 0);
        region    = get(parts, 1);
        city      = get(parts, 2);
        street    = get(parts, 3);
        house     = get(parts, 4);
        building  = get(parts, 5);
        apartment = get(parts, 6);
    }

    private static String get(String[] arr, int idx) {
        if (idx >= arr.length || arr[idx] == null) return "";
        return arr[idx].trim();
    }

    @Override
    public String toString() {
        return String.format(
                "Страна='%s', Регион='%s', Город='%s', Улица='%s', Дом='%s', Корпус='%s', Квартира='%s'",
                country, region, city, street, house, building, apartment);
    }
}