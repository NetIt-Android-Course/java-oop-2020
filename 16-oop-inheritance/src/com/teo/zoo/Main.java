package com.teo.zoo;

import com.teo.zoo.animals.Animal;
import com.teo.zoo.animals.Cat;
import com.teo.zoo.animals.Dog;
import com.teo.zoo.animals.Kitten;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("pesho", Breed.DAKEL, Sex.MALE);
        Dog dog2 = new Dog("pesho2", Breed.DAKEL, Sex.MALE);
        Dog dog3 = new Dog("pesho3", Breed.DAKEL, Sex.MALE);

        Dog[] dogs = new Dog[]{
                dog1, dog2, dog3,
                new Dog("pesho3", Breed.DAKEL, Sex.MALE),
                new Dog("pesho3", Breed.DAKEL, Sex.MALE)
        };

        Cat cat = new Cat("gerginka", Breed.PERCIAN, Sex.FEMALE);

        Cat[] cats = new Cat[] {
            cat,
            new Cat("asdf", Breed.DAKEL, Sex.FEMALE),
            new Kitten("asdf", Breed.DAKEL)
        };

        System.out.println("Dogs avg age: " + calculateAverageAnimalAge(dogs));
        System.out.println("Cats avg age: " + calculateAverageAnimalAge(cats));

        Animal unknownAnimal = dog1;

//        if(unknownAnimal instanceof Cat) {
//            ((Cat) unknownAnimal).die();
//            System.out.println("kotka");
//        } else if(unknownAnimal instanceof Dog) {
//            System.out.println(((Dog) unknownAnimal).getUniqueDogNumber());
//        } else {
//            System.out.println(unknownAnimal.getBreed());
//        }


//        for (int i = 0; i < dogs.length; i++) {
//            System.out.println(dogs[i].getName() + " " + dogs[i].getBreed().getReadableName());
//        }
    }

    public static double calculateAverageAnimalAge(Animal[] animals) {
        double result = 0;
        for (int i = 0; i < animals.length; i++) {
            result = result + animals[i].getAge();
        }

        return result / animals.length;
    }
}
