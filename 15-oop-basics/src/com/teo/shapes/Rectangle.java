package com.teo.shapes;

public class Rectangle {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getCircumfrence() {
        return 2 * (sideA + sideB);
    }

    public int getArea() {
        return sideA * sideB;
    }
}
