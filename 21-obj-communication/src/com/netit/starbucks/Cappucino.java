package com.netit.starbucks;

import com.netit.starbucks.addons.Sugar;

public class Cappucino extends Drink {

    public Cappucino() {
        super(new Sugar());
    }

    @Override
    public double cost() {
        return getAddOnCost() + 2;
    }
}
