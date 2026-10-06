package practice7.z8;

public class Main {
    public static void main(String[] args) {
        Printable[] items = {
                new Book("Война и мир", "Л. Н. Толстой", 1863),
                new Book("Отцы и дети", "И. Тургенев", 1862),
                new Book("Преступление и наказание", "Ф. М. Достоевский", 1866)
        };

        Book.printBooks(items);
    }
}
