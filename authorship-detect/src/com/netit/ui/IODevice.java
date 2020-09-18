package com.netit.ui;

public interface IODevice {

    int getNumberOfTextsFromUser();

    String[] getTextsFromUser(int numberOfTexts);

    void showResultToUser(String text);
}
