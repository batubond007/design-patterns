package main.shape;

public class Rectangle extends Shape {
    double width, height;

    public Rectangle(Rectangle source) {
        super(source);
        this.width = source.width;
        this.height = source.height;
    }

    public Rectangle(int x, int y, String colorCode, double width, double height) {
        super(x, y, colorCode);
        this.width = width;
        this.height = height;
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

}
