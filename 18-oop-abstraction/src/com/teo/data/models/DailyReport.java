package com.teo.data.models;

import java.util.HashMap;

public class DailyReport {

    private SimpleDate reportDate;
    private HashMap<Client, Double> timeSpentPerClient;

    public DailyReport(SimpleDate reportDate) {
        this.reportDate = reportDate;
        this.timeSpentPerClient = new HashMap<>();
    }

    public void add(Client client, double hoursWorked) {
        double previousHoursWorked = 0;
        if(timeSpentPerClient.get(client) != null) {
            previousHoursWorked = timeSpentPerClient.get(client);
        }
        timeSpentPerClient.put(client, hoursWorked + previousHoursWorked);
    }

    public double get(Client client) {
        return timeSpentPerClient.get(client);
    }

    public SimpleDate getTimestamp() {
        return reportDate;
    }
}
