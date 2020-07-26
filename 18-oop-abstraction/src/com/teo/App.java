package com.teo;

import com.teo.controllers.LoginController;
import com.teo.controllers.NavigationController;
import com.teo.io.ConsoleDevice;

public class App {

    public static void main(String[] args) {
        NavigationController.getInstance(new ConsoleDevice()).startLogin();
    }
}
