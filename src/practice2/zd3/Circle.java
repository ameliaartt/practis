package practice2.zd3;

import practice2.zd2.Ball;

public class Circle {
    private Point center;
    private double r;

    public Circle(Point center, double r){
        this.center = center;
        this.r = r;
    }

    public Point getCenter() { return center; }
    public double getRadius() { return r; }
    public void setCenter(double x) { this.center = center; }
    public void setRadius(double y) { this.r = r; }

    @Override
    public String toString() {
        return "Circle{center=" + center + ", radius=" + r + "}";
    }

}
