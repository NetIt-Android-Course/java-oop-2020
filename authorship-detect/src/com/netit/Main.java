package com.netit;

import com.netit.core.Manager;
import com.netit.ui.ConsoleDevice;

public class Main {

    public static void main(String[] args) {
        new Manager(new ConsoleDevice()).start();
    }
}
