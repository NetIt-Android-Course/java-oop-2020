package com.teo;

import com.teo.io.IODevice;
import com.teo.services.AuthenticationService;

public class Controller {

    private AuthenticationService authenticationService;
    private IODevice ioDevice;

    public Controller(IODevice ioDevice) {
        this.ioDevice = ioDevice;
        this.authenticationService = new AuthenticationService();
        startProgram();
    }

    private void startProgram() {
        login();
        if(authenticationService.isUserAdmin()) {
            ioDevice.showAdminOptions();
        } else {
            //TODO show empl options
        }
    }

    private void login() {
        while (!authenticationService.isUserLogged()) {
            String username = ioDevice.getUsernameFromUser();
            String password = ioDevice.getPasswordFromUser();
            if(!authenticationService.requestAuthentication(username, password)) {
                ioDevice.showErrorWrongLoginCredentials();
            }
        }
    }
}
