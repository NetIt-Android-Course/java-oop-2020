package com.netit;

public class SimpleTime {

    public int hours;
    public int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return "SimpleTime{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }

    public boolean isAfter(SimpleTime time) {
        return this.hours > time.hours ||
                (this.hours == time.hours && this.minutes > time.minutes);
    }

    public boolean isBefore(SimpleTime time) {
        return this.hours < time.hours ||
                (this.hours == time.hours && this.minutes < time.minutes);
    }
}
