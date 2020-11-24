package com.netit.weather;

import com.netit.singleton.FileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeatherSource {

    private static WeatherSource instance;
    private List<Observer> observers;

    public static WeatherSource getInstance() {
        if(instance == null) instance = new WeatherSource();
        return instance;
    }

    private WeatherSource() {
        observers = new ArrayList<>();
    }

    int currentTemperature;

    public void generateWeatherData(int temperature) {
        currentTemperature = temperature;
        FileManager.getInstance().writeTemperature(temperature);

        observers.forEach(observer -> observer.onNewTemperatureReceived(temperature));
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void start() {
        new Thread(() -> {
            while (true) {
                generateWeatherData(new Random().nextInt());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }).start();
    }
}
