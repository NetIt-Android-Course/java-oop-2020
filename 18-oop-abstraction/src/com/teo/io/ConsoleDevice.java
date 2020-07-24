package com.teo.io;

import java.util.Scanner;

public class ConsoleDevice implements IODevice {

    private Scanner scanner;

    public ConsoleDevice() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getPasswordFromUser() {
        print("Enter password:");
        return scanner.nextLine();
    }

    @Override
    public String getUsernameFromUser() {
        print("Enter username:");
        return scanner.nextLine();
    }

    @Override
    public void showErrorWrongLoginCredentials() {
        print("Wrong username or password.");
    }

    @Override
    public void showAdminOptions() {
        print("Press 1 to see all users\n" +
                "Press 2 to see all clients\n" +
                "Press 3 to enter new client\n" +
                "Press 4 to see report for a user");
    }

    private void print(String text) {
        System.out.println(text);
    }
}
