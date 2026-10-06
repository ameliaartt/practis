package practice4.z3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product p) {
        items.add(p);
        System.out.println("Добавлено в корзину: " + p.getName());
    }

    public List<Product> getItems() { return items; }

    public double getTotalPrice() {
        double sum = 0;
        for (Product p : items) {
            sum += p.getPrice();
        }
        return sum;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }
}