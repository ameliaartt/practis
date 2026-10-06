package practice4.z3;

public enum Category {
    ELECTRONICS("Электроника"),
    BOOKS("Книги"),
    CLOTHING("Одежда");

    private final String title;

    Category(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}