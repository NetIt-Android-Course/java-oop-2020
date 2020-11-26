package com.netit.shapes.oop;

import java.awt.*;

public class Circle implements Shape {
    private Point center;
    private double radius;
    public final double PI = 3.141592653589793;

    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
