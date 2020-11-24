package com.netit.pond.ducks;

import com.netit.pond.behaviors.Flyable;

public abstract class Duck {

    private int age;
    private Flyable flyBehavior;

    public Duck(Flyable flyable) {
        this.flyBehavior = flyable;
    }

    public Duck() {

    }

    public abstract void draw();

    public void swim() {
        draw();
        System.out.println(" is swimming.");
    }

    public void fly() {
        if(flyBehavior != null) flyBehavior.fly();
    }

    public void swapFlyBehavior(Flyable flyable) {
        this.flyBehavior = flyable;
    }
}
