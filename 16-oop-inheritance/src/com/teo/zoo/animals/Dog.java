package com.teo.zoo.animals;

import com.teo.zoo.Breed;
import com.teo.zoo.Sex;

public class Dog extends Animal {

    private static int dogObjectCounter = 0;
    private int uniqueDogNumber;
    private final String name;

    public Dog(String name, Breed breed, Sex sex) {
        super(breed, sex);
        this.name = name;

        dogObjectCounter++;
        uniqueDogNumber = dogObjectCounter;
    }

    public String getName() {
        return name;
    }

//    public Breed getBreed() {
//        System.out.println("this is the dog classs");
//        return breed;
//    }

    public int getUniqueDogNumber() {
        return uniqueDogNumber;
    }
}
