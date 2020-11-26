package com.netit.shapes.oop;

public class Triangle implements Shape {

    private double a;
    private double b;
    private double c;

    @Override
    public double area() {
        return 3 * a;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
