package com.teo.duck_simulator;

import com.teo.duck_simulator.ducks.*;

public class Simulator {

    public void startSimulation() {
        MallardDuck mallardDuck1 = new MallardDuck();
        MallardDuck mallardDuck2 = new MallardDuck();
        MallardDuck mallardDuck3 = new MallardDuck();
        BrownDuck brownDuck = new BrownDuck();
        RubberDuck rubberDuck = new RubberDuck();

        Duck[] ducks = new Duck[] {
                mallardDuck1,
                mallardDuck2,
                mallardDuck3,
                brownDuck,
                rubberDuck
        };

        //for-each loop
        for(Duck d : ducks) {
            d.swim();
            if(d instanceof CanFly) {
                ((CanFly) d).fly();
            }
            System.out.println(d.duckType);
        }

    }
}
