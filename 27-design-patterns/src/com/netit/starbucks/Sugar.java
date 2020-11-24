package com.netit.starbucks;

public class Sugar extends Additions {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return 0.10 + rootBev.cost();
    }
}
