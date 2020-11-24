package com.netit.weather;

public interface Observer {
    void onNewTemperatureReceived(int temp);
}
