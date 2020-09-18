package com.netit;

public class TextSigniture {
    public int value = 11;

    public TextSigniture deepCopy() {
        TextSigniture newTextSign = new TextSigniture();
        newTextSign.value = this.value;
        return newTextSign;
    }
}
