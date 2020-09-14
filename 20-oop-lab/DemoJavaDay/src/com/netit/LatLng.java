package com.netit;

public class LatLng {

    public double latitude;
    public double longtitude;

    public LatLng(double latitude, double longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public double distanceTo(LatLng userLocation) {
        return Math.sqrt(Math.pow(this.latitude - userLocation.latitude, 2) +
                Math.pow(this.longtitude - userLocation.longtitude, 2));
    }

    @Override
    public String toString() {
        return "LatLng{" +
                "latitude=" + latitude +
                ", longtitude=" + longtitude +
                '}';
    }
}
