package practice7.z8;

public class Book implements Printable {
    private String name;
    private String author;
    private int year;

    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.printf("Книга '%s' (автор %s) была издана в %d году\n",
                name, author, year);
    }

    public static void printBooks(Printable[] printable) {
        System.out.println("Список книг");
        for (Printable p : printable) {
            if (p instanceof Book) {
                p.print();
            }
        }
    }

    public String getName()   { return name; }
    public String getAuthor() { return author; }
    public int getYear()      { return year; }
}
