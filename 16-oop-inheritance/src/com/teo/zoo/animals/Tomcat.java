package com.teo.zoo.animals;

import com.teo.zoo.Breed;
import com.teo.zoo.Sex;

public class Tomcat extends Cat {

    public Tomcat(String name, Breed breed) {
        super(name, breed, Sex.MALE);
    }
}
