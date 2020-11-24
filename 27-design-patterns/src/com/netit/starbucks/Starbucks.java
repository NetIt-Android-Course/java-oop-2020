package com.netit.starbucks;

public class Starbucks {

    public Starbucks() {
        Beverage blackCoffee = new Sugar(new Cream(new BlackCoffee()));
        System.out.println(blackCoffee.cost());
    }
}
