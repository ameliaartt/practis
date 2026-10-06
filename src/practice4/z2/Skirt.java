package practice4.z2;

public class Skirt extends Clothes implements WomenClothing {

    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: " + this);
    }
}
