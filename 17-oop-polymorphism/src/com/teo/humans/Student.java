package com.teo.humans;

public class Student extends Human {

    private float grade;

    public Student(String name, String familyName) {
        super(name, familyName);
    }

    @Override
    protected void work() {
        System.out.println("does not work");
    }
}
