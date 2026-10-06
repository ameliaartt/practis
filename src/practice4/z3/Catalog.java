package practice4.z3;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private Category category;
    private List<Product> products = new ArrayList<>();

    public Catalog(Category category) {
        this.category = category;
    }

    public void addProduct(Product p) {
        if (p.getCategory() == category) {
            products.add(p);
        }
    }

    public Category getCategory() { return category; }
    public List<Product> getProducts() { return products; }
}
