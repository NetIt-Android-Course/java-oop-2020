package com.teo.dog_shelter;

public class Dog {

    private String name;
    private String ownerName;
    private byte age;
    private byte numberOfLegs;

    public Dog(String name, String ownerName) {
        this(name, ownerName, (byte) 0, (byte) 4);
    }

    public Dog(String name, String ownerName, byte age, byte numberOfLegs) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public void setOwnerName(String ownerName) {
        if(ownerName.length() > 0) {
            this.ownerName = ownerName;
        }
    }

    public void celebrateBirthday() {
        age++;
    }

    public void bePartOfAnAccedent() {
        numberOfLegs--;
    }
}
