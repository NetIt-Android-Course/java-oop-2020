package com.teo.io;

import com.teo.data.consts.AdminOption;
import com.teo.data.consts.EmployeeOption;
import com.teo.data.models.Admin;
import com.teo.data.models.Client;
import com.teo.data.models.DailyReport;
import com.teo.data.models.User;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConsoleDevice implements IODevice {

    private Scanner scanner;

    public ConsoleDevice() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String getPasswordFromUser() {
        print("Enter password:");
        return getStringFromUser();
    }

    @Override
    public String getUsernameFromUser() {
        print("Enter username:");
        return getStringFromUser();
    }

    @Override
    public void showErrorWrongLoginCredentials() {
        print("Wrong username or password.");
    }

    @Override
    public void showAdminOptions() {
        print("Press " + AdminOption.SEE_ALL_USERS.value() + " to see all users\n" +
                "Press " + AdminOption.SEE_ALL_CLIENTS.value() + " to see all clients\n" +
                "Press " + AdminOption.ENTER_NEW_CLIENT.value() + " to enter new client\n" +
                "Press " + AdminOption.CREATE_NEW_USER.value() + " to create new users\n" +
                "Press " + AdminOption.SEE_USER_REPORT.value() + " to see report for a user\n" +
                "Press " + AdminOption.SEE_ALL_USERS.value() + " to see report for a user\n" +
                "Press " + AdminOption.LOGOUT.value() + " to logout");
    }

    @Override
    public void showEmployeeOptions() {
        print("Press " + EmployeeOption.SEE_ALL_REPORTS.value() + " to see all your reports\n" +
                "Press " + EmployeeOption.ENTER_NEW_REPORT.value() + " to enter new report\n" +
                "Press " + EmployeeOption.LOGOUT.value() + " to logout");
    }

    @Override
    public AdminOption getAdminOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid admin option:");
            userInput = getNumberFromUser();
        } while (AdminOption.convertToAdminOption(userInput) == null);
        return AdminOption.convertToAdminOption(userInput);
    }

    @Override
    public int getNewUserTypeFromUser() {
        print("Press 1 to create a new employee\n" +
                "Press 2 to create a new admin\n");
        return Integer.parseInt(getStringFromUser());
    }

    @Override
    public String getNewUserUsernameFromUser() {
        print("Enter username for new user:");
        return getStringFromUser();
    }

    @Override
    public String getNewUserPasswordFromUser() {
        print("Enter password for new user:");
        return getStringFromUser();
    }

    @Override
    public void showLoginMessage() {
        print("No logged user. Please, login.");
    }

    @Override
    public String getClientNameFromUser() {
        print("Enter client name:");
        return getStringFromUser();
    }

    @Override
    public String getProjectNameFromUser() {
        print("Enter project name:");
        return getStringFromUser();
    }

    @Override
    public Date getDateFromUser() {
        print("Enter date in format dd/MM/yyyy:");
        String dateText = getStringFromUser();
        Date date;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(dateText);
        } catch (ParseException e) {
            print("Wrong date format. Try again:");
            return getDateFromUser();
        }
        return date;
    }

    @Override
    public void showAllUsers(List<User> allUsers) {
        int index = 1;
        for(User user : allUsers) {
            print(index++ + ". " + user.getUsername() + ", " + (user instanceof Admin ? "Admin" : "Employee"));
        }
    }

    @Override
    public void showClients(List<Client> allClients) {
        int index = 1;
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MMM.yyyy");
        for(Client client : allClients) {
            print(index++ + ". " + client.getName() + ", " + client.getProjectName() + ", ends at " +
                    sdf.format(new Date(client.getProjectEndTimestamp())));
        }
    }

    @Override
    public EmployeeOption getEmployeeOptionFromUser() {
        int userInput;
        do {
            print("Enter a valid employee option:");
            userInput = getNumberFromUser();
        } while (EmployeeOption.convertToEmployeeOption(userInput) == null);
        return EmployeeOption.convertToEmployeeOption(userInput);
    }

    @Override
    public double getHoursWorkedFromUser() {
        print("Enter hours worked:");
        return getDecimalNumberFromUser();
    }

    @Override
    public void showNoSuchClientError() {
        print("No such client name.");
    }

    @Override
    public void showReports(Collection<DailyReport> reports, User user) {
        print("Reports for user " + user.getUsername());
        print("--------------------------------");
        for(DailyReport report : reports) {
            print("->" + report.getDate() + " -> " + report.getHoursWorked() + " hours");
            Set<Map.Entry<Client, Double>> entries = report.getEntries();

            int index = 1;
            for (Map.Entry<Client, Double> entry : entries) {
                print(index++ + ". " + entry.getKey().getName() + " - " + entry.getValue());
            }
        }
    }

    @Override
    public void showNoSuchUserError() {
        print("No such user.");
    }

    @Override
    public void showUserNotEmployeeError() {
        print("This user is an Admin. No reports to show.");
        print("---------------------------------");
    }

    private String getStringFromUser() {
        return scanner.nextLine();
    }

    private int getNumberFromUser() {
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            print("Not a valid number. Try again:");
            return getNumberFromUser();
        }
        return number;
    }

    private double getDecimalNumberFromUser() {
        double number;
        try {
            number = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException exception) {
            print("Not a valid number. Try again:");
            return getDecimalNumberFromUser();
        }
        return number;
    }

    private void print(String text) {
        System.out.println(text);
    }
}
