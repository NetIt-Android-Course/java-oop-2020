package com.teo.zoo;

public enum Breed {
    DAKEL ("Dakel"),
    PITBUL ("Pit Bul"),
    PINCHER ("Pincher"), PERCIAN("Персийка");

    private final String readableName;

    Breed(String readableName) {
        this.readableName = readableName;
    }

    public String getReadableName() {
        return readableName;
    }


}
