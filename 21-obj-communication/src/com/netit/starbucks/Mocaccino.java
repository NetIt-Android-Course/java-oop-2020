package com.netit.starbucks;

import com.netit.starbucks.addons.Cream;
import com.netit.starbucks.addons.Sugar;

public class Mocaccino extends Drink {

    public Mocaccino() {
        super(new Sugar(), new Cream());
    }

    @Override
    public double cost() {
        return getAddOnCost() + 5;
    }
}
