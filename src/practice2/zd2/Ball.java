package practice2.zd2;

public class Ball {
    private double x;
    private double y;
    private double dy;
    private double dx;

    public Ball(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){return x;}

    public void setX(double x){this.x = x;}

    public double getY(){return y;}

    public void setY(double y){this.y = y;}

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy){
        this.x = x + dx;
        this.y = y + dy;
    }

    @Override
    public String toString(){
        return "Author{" +
                "x = " + x +
                ", y = " + y + '\'' +
                "}";
    }
}
