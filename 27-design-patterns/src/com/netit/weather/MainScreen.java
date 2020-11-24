package com.netit.weather;

public class MainScreen {

    public static MainScreen instance = new MainScreen();

    public MainScreen() {
        WeatherSource.getInstance().addObserver(temp -> showTemperature(temp));
    }

    public void showTemperature(int temp) {
        System.out.println("Showing temp on Main screen:" + temp);
    }
}
