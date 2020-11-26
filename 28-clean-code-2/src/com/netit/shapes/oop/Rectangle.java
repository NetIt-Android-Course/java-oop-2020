package com.netit.shapes.oop;

import java.awt.Point;

public class Rectangle implements Shape {
    private Point topLeft;
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
