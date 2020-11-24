package com.netit.starbucks;

public abstract class Additions extends Beverage {

    protected Beverage rootBev;

    public Additions(Beverage beverage) {
        rootBev = beverage;
    }

    public abstract double cost();
}
