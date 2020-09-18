package com.netit.ui;

public class UiDevice implements IODevice {

    @Override
    public int getNumberOfTextsFromUser() {
        return 0;
    }

    @Override
    public String[] getTextsFromUser(int numberOfTexts) {
        return new String[0];
    }

    @Override
    public void showResultToUser(String text) {

    }
}
