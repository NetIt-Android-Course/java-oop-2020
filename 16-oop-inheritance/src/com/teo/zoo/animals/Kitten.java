package com.teo.zoo.animals;

import com.teo.zoo.Breed;
import com.teo.zoo.Sex;

public class Kitten extends Cat {

    public Kitten(String name, Breed breed) {
        super(name, breed, Sex.FEMALE);
    }
}
