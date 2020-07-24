package com.teo.duck_simulator.ducks;

public class BrownDuck extends Duck implements CanFly, CanDie {

    @Override
    public void swim() {
        System.out.println("splash splash : 20 km/h");
    }

    @Override
    public void fly() {
        System.out.println("fiuuuu : 20km/h");
    }

    @Override
    public void die() {
        System.out.println("dead");
    }
}
