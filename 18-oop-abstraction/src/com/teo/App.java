package com.teo;

import com.teo.io.ConsoleDevice;

public class App {

    public static void main(String[] args) {
        Controller controller = new Controller(new ConsoleDevice());
    }
}
