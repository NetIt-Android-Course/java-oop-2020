package com.netit.weather;

public class DashboardScreen implements Observer {

    public DashboardScreen() {
        WeatherSource.getInstance().addObserver(this);
    }

    public void showTemperature(int temp) {
        System.out.println("Showing temp on Dashboard:" + temp);
    }

    @Override
    public void onNewTemperatureReceived(int temp) {
        showTemperature(temp);
    }
}
