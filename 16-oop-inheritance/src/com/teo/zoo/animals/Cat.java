package com.teo.zoo.animals;

import com.teo.zoo.Breed;
import com.teo.zoo.Sex;

public class Cat extends Animal {

    private final String name;
    private int numberOfLivesLeft;

    public Cat(String name, Breed breed, Sex sex) {
        super(breed, sex);
        this.name = name;
        numberOfLivesLeft = 9;
    }

    public String getName() {
        return name;
    }

    public void die() {
        if(numberOfLivesLeft <= 1) {
            numberOfLivesLeft--;
            System.out.println("the cat is dead");
        } else {
            numberOfLivesLeft--;
        }
    }
}
