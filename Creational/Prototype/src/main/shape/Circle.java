package main.shape;

public class Circle extends Shape {
    double radius;
    public Circle(int x, int y, String colorCode, double radius){
        super(x, y, colorCode);
        this.radius = radius;
    }
    public Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public double getRadius() {
        return radius;
    }
}
