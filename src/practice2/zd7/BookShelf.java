package practice2.zd7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookShelf {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) { books.add(b); }

    public Book getLatest() {
        return books.stream().max(Comparator.comparingInt(Book::getYear)).orElse(null);
    }

    public Book getEarliest() {
        return books.stream().min(Comparator.comparingInt(Book::getYear)).orElse(null);
    }

    public void sortByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }

    public void printAll() {
        for (Book b : books) System.out.println("  " + b);
    }
}
