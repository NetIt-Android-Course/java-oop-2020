package com.teo.dog_shelter;

public class Shelter {

    private Dog[] dogCages;

    public Shelter(int dogCagesCount) {
        this.dogCages = new Dog[dogCagesCount];
    }

    public void addDog(Dog dog) {
        for (int cageIndex = 0; cageIndex <dogCages.length; cageIndex++) {
            if(dogCages[cageIndex] == null) {
                dogCages[cageIndex] = dog;
                break;
            }
        }
    }

    public void printDogs() {
        for (int i = 0; i < dogCages.length; i++) {
            if(dogCages[i] != null) {
                System.out.println("Dog: " + dogCages[i].getName() + " " + dogCages[i].getAge());
            }
        }
    }

    public void adoptDog(String dogName) {
        for (int i = 0; i < dogCages.length; i++) {
            if(dogCages[i] != null && dogCages[i].getName().equals(dogName)) {
                dogCages[i] = null;
            }
        }
    }
}
