package com.netit.pond.ducks;

import com.netit.pond.behaviors.Flyable;
import com.netit.pond.behaviors.NoFly;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super(new NoFly());
    }

    @Override
    public void draw() {
        System.out.print("Rubber ducky ");
    }

    @Override
    public void swim() {
        draw();
        System.out.println(" floating.");
    }
}
