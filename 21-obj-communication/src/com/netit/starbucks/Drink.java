package com.netit.starbucks;

import com.netit.starbucks.addons.AddOn;

public abstract class Drink {

    protected AddOn[] addOns;

    public Drink(AddOn...addOns) {
        this.addOns = addOns;
    }

    public double getAddOnCost() {
        double addonCost = 0;
        for (int i = 0; i < addOns.length; i++) {
            addonCost = addOns[i].cost();
        }
        return addonCost;
    }

    public abstract double cost();
}
