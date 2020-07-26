package com.teo.controllers;

import com.teo.io.IODevice;
import com.teo.services.AuthenticationService;

public class LoginController implements Controller {

    private final AuthenticationService authenticationService;
    private final IODevice ioDevice;

    public LoginController(IODevice ioDevice, AuthenticationService authenticationService) {
        this.ioDevice = ioDevice;
        this.authenticationService = authenticationService;
    }

    @Override
    public void start() {
        login();
        if(authenticationService.isUserAdmin()) {
            NavigationController.getInstance(ioDevice).startAdmin();
        } else {
            NavigationController.getInstance(ioDevice).startEmployee();
        }
    }

    private void login() {
        while (!authenticationService.isUserLogged()) {
            ioDevice.showLoginMessage();
            String username = ioDevice.getUsernameFromUser();
            String password = ioDevice.getPasswordFromUser();
            if(!authenticationService.requestAuthentication(username, password)) {
                ioDevice.showErrorWrongLoginCredentials();
            }
        }
    }
}
