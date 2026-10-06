package practice4.z2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {

    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужская футболка: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женская футболка: " + this);
    }
}
