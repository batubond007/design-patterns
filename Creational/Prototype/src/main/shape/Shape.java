package main.shape;

public abstract class Shape {
    int x, y;
    String colorCode;

    public Shape(int x, int y, String colorCode) {
        this.x = x;
        this.y = y;
        this.colorCode = colorCode;
    }

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
        this.colorCode = source.colorCode;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColorCode() {
        return colorCode;
    }

    public abstract Shape clone();
}
