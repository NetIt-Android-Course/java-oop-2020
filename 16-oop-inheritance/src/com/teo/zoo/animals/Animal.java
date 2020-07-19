package com.teo.zoo.animals;

import com.teo.zoo.Breed;
import com.teo.zoo.Sex;

public class Animal {

    protected Breed breed;
    protected int age;
    protected Sex sex;

    public Animal(Breed breed, Sex sex) {
        this.breed = breed;
        this.sex = sex;
    }

    public void drink() {
        System.out.println("gulp gulp");
    }

    public Breed getBreed() {
        System.out.println("this is the animal classs");

        return breed;
    }

    public void makeSound() {
        System.out.println("asdf");
    }

    public int getAge() {
        return age;
    }
}
