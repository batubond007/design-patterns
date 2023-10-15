import shape.Circle;
import shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        var circle = new Circle(1, -1, "#ffffff", 0.5);
        var rectangle = new Rectangle(1, -1, "#1f2f3f", 2, 3);
        var otherCircle = circle.clone();
        var otherRectangle = rectangle.clone();
        System.out.println(otherCircle.getX() == otherRectangle.getX());
    }
}