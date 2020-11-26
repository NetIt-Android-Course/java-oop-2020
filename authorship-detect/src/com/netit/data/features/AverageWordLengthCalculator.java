package com.netit.data.features;

import java.util.Arrays;

public class AverageWordLengthCalculator implements FeatureCalculator {

    private String stripPunctuation(String word) {
        StringBuilder result = new StringBuilder();
        word.chars()
                .mapToObj(value -> (char) value)
                .filter(value -> isNotPunctioation(value))
                .forEach(character -> result.append(character));
        return result.toString();
    }

    private boolean isNotPunctioation(char letter) {
        return letter != '.' &&
                letter != ',' &&
                letter != ':' &&
                letter != ';' &&
                letter != '\'';
    }

    private boolean isNotPunctioation(String word) {
        return word != null && word.length() > 0 && isNotPunctioation(word.charAt(0));
    }

    @Override
    public int getFeatureValue(String text) {
        return Arrays.stream(text.split(" "))
                .filter(this::isNotPunctioation)
                .map(this::stripPunctuation)
                .map(String::length)
                .reduce((integer, integer2) -> (integer + integer2) / 2)
                .get();
    }
}
