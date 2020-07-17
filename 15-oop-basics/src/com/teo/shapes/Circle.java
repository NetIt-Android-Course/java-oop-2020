package com.teo.shapes;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
