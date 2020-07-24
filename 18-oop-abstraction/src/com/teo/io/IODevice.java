package com.teo.io;

public interface IODevice {

    String getPasswordFromUser();
    String getUsernameFromUser();
    void showErrorWrongLoginCredentials();
    void showAdminOptions();
}
