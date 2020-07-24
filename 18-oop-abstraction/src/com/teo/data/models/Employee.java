package com.teo.data.models;

import java.util.HashMap;
import java.util.List;

public class Employee extends User {

    private final HashMap<SimpleDate, DailyReport> reports;

    public Employee(String username, String password) {
        super(username, password);
        this.reports = new HashMap<>();
    }

    public void addReport(int day, int month, int year, Client client, double hoursWorked) {
        SimpleDate reportDate = new SimpleDate(day, month, year);
        if(reports.get(reportDate) != null) {
            reports.get(reportDate).add(client, hoursWorked);
        } else {
            DailyReport report = new DailyReport(reportDate);
            report.add(client, hoursWorked);
            reports.put(reportDate, report);
        }
    }

    public List<DailyReport> getReports() {
        return (List<DailyReport>) reports.values();
    }
}
