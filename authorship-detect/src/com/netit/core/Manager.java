package com.netit.core;

import com.netit.ui.IODevice;

public class Manager {

    private IODevice ioDevice;

    public Manager(IODevice ioDevice) {
        this.ioDevice = ioDevice;
    }

    public void start() {
        int textCount = ioDevice.getNumberOfTextsFromUser();
        String[] texts = ioDevice.getTextsFromUser(textCount);

        //calc

        ioDevice.showResultToUser("result");
    }
}
