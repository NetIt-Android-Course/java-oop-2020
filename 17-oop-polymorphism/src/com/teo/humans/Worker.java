package com.teo.humans;

import java.util.Objects;

public class Worker extends Human {

    private float costPerHour;
    private float hoursWorked;

    public Worker(String name, String familyName, float costPerHour) {
        super(name, familyName);
        this.hoursWorked = 0;
        this.costPerHour = costPerHour;
    }

    public void addHoursWorked(float hours) {
        this.hoursWorked = this.hoursWorked + hours;
    }

    public float calculateCost() {
        return costPerHour * hoursWorked;
    }

    public float getCostPerHour() {
        return costPerHour;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }



    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Worker otherWorker = (Worker) otherObject;
        return this.getName().equals(otherWorker.getName()) &&
                this.getFamilyName().equals(otherWorker.getFamilyName()) &&
                Float.compare(otherWorker.costPerHour, costPerHour) == 0 &&
                Float.compare(otherWorker.hoursWorked, hoursWorked) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(costPerHour, hoursWorked);
    }

    @Override
    public String toString() {
        return "Worker:" + getName() + " " + getFamilyName() + " " + getCostPerHour();
    }

    @Override
    public void work() {
        System.out.println("work work");
    }
}
