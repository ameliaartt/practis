package practice4.z2;

public class Tie extends Clothes implements MenClothing {

    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: " + this);
    }
}