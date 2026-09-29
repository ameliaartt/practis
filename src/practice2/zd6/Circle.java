package practice2.zd6;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    public double getRadius() { return r; }
    public void setRadius(double radius) {this.r = r; }
    public double getArea() { return Math.PI * r * r; }
    public double getLength() { return 2 * Math.PI * r; }
    public boolean isEqual(Circle other) { return this.r == other.r; }
}
