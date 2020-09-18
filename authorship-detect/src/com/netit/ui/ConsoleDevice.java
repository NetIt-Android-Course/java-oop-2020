package com.netit.ui;

import java.util.Scanner;

public class ConsoleDevice implements IODevice {

    @Override
    public int getNumberOfTextsFromUser() {
        return new Scanner(System.in).nextInt();
    }

    @Override
    public String[] getTextsFromUser(int numberOfTexts) {
        String[] texts = new String[numberOfTexts];
        for (int i = 0; i < numberOfTexts; i++) {
            texts[i] = new Scanner(System.in).next();
        }
        return texts;
    }

    @Override
    public void showResultToUser(String text) {
        print(text);
    }

    private void print(String text) {
        System.out.println(text);
    }
}
