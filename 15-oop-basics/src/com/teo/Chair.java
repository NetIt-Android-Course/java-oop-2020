package com.teo;

public class Chair {

    //fields
    String color;
    String material;
    int numberOfLegs;
    int positionX;
    int positionY;

    //constructors
    Chair(String chairColor, String chairMaterial) {
        this(chairColor, chairMaterial, 4, 11, 45);
    }

    Chair() {
        this("no color",
                "no material",
                4, 11, 45);
    }

    Chair(String chairColor, String chairMaterial,
          int numberOfLegs, int posX, int posY) {
        color = chairColor;
        material = chairMaterial;
        this.numberOfLegs = numberOfLegs;
        positionX = posX;
        positionY = posY;
    }

    //methods
    void moveChair(int newPositionX, int newPositionY) {
        positionX = newPositionX;
        positionY = newPositionY;
    }
}
