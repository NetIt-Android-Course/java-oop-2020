package com.teo.controllers;

import com.teo.io.IODevice;
import com.teo.services.AuthenticationService;

public class NavigationController {

    private static NavigationController instance;

    public static NavigationController getInstance(IODevice ioDevice) {
        if(instance == null) instance = new NavigationController(ioDevice);

        return instance;
    }

    private final Controller loginController;
    private final Controller adminController;
    private final Controller employeeController;

    private NavigationController(IODevice ioDevice) {
        AuthenticationService authenticationService = new AuthenticationService();

        loginController = new LoginController(ioDevice, authenticationService);
        adminController = new AdminController(ioDevice, authenticationService);
        employeeController = new EmployeeController(ioDevice, authenticationService);
    }

    public void startLogin() {
        loginController.start();
    }

    public void startAdmin() {
        adminController.start();
    }

    public void startEmployee() {
        employeeController.start();
    }
}
