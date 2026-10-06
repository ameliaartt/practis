package practice4.z2;

public abstract class Clothes {
    protected Size size;
    protected double cost;
    protected String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() { return size; }
    public double getCost() { return cost; }
    public String getColor() { return color; }

    @Override
    public String toString() {
        return String.format("%s, размер %s (EU %d), цвет %s, цена %.2f руб.",
                getClass().getSimpleName(), size, size.getEuroSize(), color, cost);
    }
}
