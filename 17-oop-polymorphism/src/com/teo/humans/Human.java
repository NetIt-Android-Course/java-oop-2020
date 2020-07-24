package com.teo.humans;

public abstract class Human {

    private final String name;
    private final String familyName;

    public Human(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    protected abstract void work();
}
