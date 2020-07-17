package com.teo.dog_shelter;

public class Application {

    public static void main(String[] args) {
        //create shelter
        Shelter shelter = new Shelter(10);

        //create dogs and add dogs to shelter
        Dog dog1 = new Dog("sharo", null);
        Dog dog2 = new Dog("shamaro", null);
        Dog dog3 = new Dog("subaru", null);

        shelter.addDog(dog1);
        shelter.addDog(dog2);
        shelter.addDog(dog3);

        dog1.celebrateBirthday();
        dog1.celebrateBirthday();
        dog1.celebrateBirthday();
        dog2.celebrateBirthday();

        //list dogs in shelter
        shelter.printDogs();

        //adopt dogs from shelter
        shelter.adoptDog("sharo");

        shelter.printDogs();
    }
}
