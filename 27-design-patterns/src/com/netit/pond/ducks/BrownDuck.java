package com.netit.pond.ducks;

import com.netit.pond.behaviors.Flyable;
import com.netit.pond.behaviors.SmoothFly;

public class BrownDuck extends Duck {

    public BrownDuck() {
        super(new SmoothFly());
    }

    @Override
    public void draw() {
        System.out.print("Brown duck ");
    }
}
