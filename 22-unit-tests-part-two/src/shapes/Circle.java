package shapes;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int findDiameter() {
        return 4 * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
}