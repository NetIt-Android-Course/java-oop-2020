package com.netit;

public class Bar implements MapPin {

    private String name;
    private LatLng location;
    private WorkingHours workingHours;

    public Bar(String name, double lat, double lng, int startingHour, int startingMinutes, int closingHour, int closingMinutes) {
        this.name = name;
        this.location = new LatLng(lat, lng);
        this.workingHours = new WorkingHours(startingHour, startingMinutes, closingHour, closingMinutes);
    }

    public String getName() {
        return name;
    }

    @Override
    public LatLng getLocation() {
        return location;
    }

    public WorkingHours getWorkingHours() {
        return workingHours;
    }

    @Override
    public String toString() {
        return "Bar{" +
                "name='" + name + '\'' +
                ", location=" + location +
                ", workingHours=" + workingHours +
                '}';
    }
}
