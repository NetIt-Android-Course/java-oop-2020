package com.netit;

public class WorkingHours {

    private final SimpleTime startingTime;
    private final SimpleTime closingTime;

    public WorkingHours(int startingHour, int startingMinutes, int closingHour, int closingMinutes) {
        this.startingTime = new SimpleTime(startingHour, startingMinutes);
        this.closingTime = new SimpleTime(closingHour, closingMinutes);
    }

    public SimpleTime getStartingTime() {
        return startingTime;
    }

    public SimpleTime getClosingTime() {
        return closingTime;
    }

    @Override
    public String toString() {
        return "WorkingHours{" +
                "startingTime=" + startingTime +
                ", closingTime=" + closingTime +
                '}';
    }

    public boolean isOpenAt(SimpleTime time) {
        return time.isAfter(startingTime) && time.isBefore(closingTime);
    }
}
