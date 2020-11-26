package com.netit.data;

import com.netit.data.features.AverageWordLengthCalculator;

public class TextSignature {

    private String text;

    public TextSignature(String text) {
        this.text = text;
    }

    public int getAverageWordLength() {
        return new AverageWordLengthCalculator().getFeatureValue(text);
    }


}
