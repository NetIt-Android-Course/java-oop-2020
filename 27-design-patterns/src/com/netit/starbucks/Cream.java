package com.netit.starbucks;

public class Cream extends Additions {

    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.30 + rootBev.cost();
    }
}
