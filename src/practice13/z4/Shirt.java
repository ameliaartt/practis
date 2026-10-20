package practice13.z4;

public class Shirt {
    private final String id;
    private final String description;
    private final String color;
    private final String size;

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public static Shirt fromString(String s) {
        String[] p = s.split(",", 4); // максимум 4 части
        return new Shirt(p[0].trim(), p[1].trim(), p[2].trim(), p[3].trim());
    }

    @Override
    public String toString() {
        return "Shirt{id='" + id + "', description='" + description +
                "', color='" + color + "', size='" + size + "'}";
    }
}
