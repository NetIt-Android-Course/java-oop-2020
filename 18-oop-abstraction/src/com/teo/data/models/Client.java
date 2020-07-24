package com.teo.data.models;

public class Client {

    private String name;
    private String projectName;
    private long projectEndTimestamp;

    public Client(String name, String projectName, long projectEndTimestamp) {
        this.name = name;
        this.projectName = projectName;
        this.projectEndTimestamp = projectEndTimestamp;
    }

    public String getName() {
        return name;
    }

    public String getProjectName() {
        return projectName;
    }

    public long getProjectEndTimestamp() {
        return projectEndTimestamp;
    }
}
