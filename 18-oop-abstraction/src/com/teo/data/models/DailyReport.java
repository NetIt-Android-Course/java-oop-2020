package com.teo.data.models;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public SimpleDate getDate() {
        return reportDate;
    }

    public Set<Map.Entry<Client, Double>> getEntries() {
        return timeSpentPerClient.entrySet();
    }

    public double getHoursWorked() {
        double sum = 0;
        for (Double hoursPerClient : timeSpentPerClient.values()) {
            sum = sum + hoursPerClient;
        }
        return sum;
    }
}
