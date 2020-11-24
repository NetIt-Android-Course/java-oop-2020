package com.netit.pond.ducks;

import com.netit.pond.behaviors.Flyable;
import com.netit.pond.behaviors.SmoothFly;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new SmoothFly());
    }

    @Override
    public void draw() {
        System.out.print("Mallard duck ");
    }
}
