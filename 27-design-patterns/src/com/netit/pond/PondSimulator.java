package com.netit.pond;

import com.netit.pond.behaviors.FastFly;
import com.netit.pond.behaviors.Flyable;
import com.netit.pond.ducks.BrownDuck;
import com.netit.pond.ducks.Duck;
import com.netit.pond.ducks.MallardDuck;
import com.netit.pond.ducks.RubberDuck;

import java.util.ArrayList;
import java.util.List;

public class PondSimulator {

    private final MallardDuck mallardDuck;
    private List<Duck> ducks;

    public PondSimulator() {
        ducks = new ArrayList<>();

        ducks.add(new BrownDuck());
        ducks.add(new BrownDuck());
        ducks.add(new BrownDuck());
        mallardDuck = new MallardDuck();
        ducks.add(mallardDuck);
        ducks.add(new MallardDuck());
        ducks.add(new MallardDuck());
        ducks.add(new RubberDuck());
        ducks.add(new RubberDuck());

        mallardDuck.swapFlyBehavior(new FastFly());
    }

    public void drawDucks() {
        ducks.forEach(Duck::draw);
    }

    public void makeDucksSwim() {
        ducks.forEach(Duck::swim);
    }

    public void makeDucksFly() {
        ducks.forEach(duck -> duck.fly());
    }
}
