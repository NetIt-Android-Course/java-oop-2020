package com.teo;

public class MyText {

    char[] value;

    void setValue(String text) {
        value = text.toCharArray();
    }

    int getLength() {
        return value.length;
    }

    char getChatAt(int index) {
        return value[index];
    }
}
