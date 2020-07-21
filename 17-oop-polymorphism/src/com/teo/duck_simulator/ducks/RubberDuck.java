package com.teo.duck_simulator.ducks;

public class RubberDuck extends Duck {


    public RubberDuck(){
        duckType = "rubber";
    }

    @Override
    public void swim() {
        System.out.println("splash splash : 0 km/h");
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("cannot fly");
    }
}
