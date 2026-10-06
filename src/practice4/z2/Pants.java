package practice4.z2;

public class Pants extends Clothes implements MenClothing, WomenClothing {

    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужские штаны: " + this);
    }

    @Override
    public void dressWomen() {
        System.out.println("Женские штаны: " + this);
    }
}
