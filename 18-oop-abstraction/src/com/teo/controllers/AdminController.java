package com.teo.controllers;

import com.teo.data.ClientRepository;
import com.teo.data.UserRepository;
import com.teo.data.consts.AdminOption;
import com.teo.data.models.Admin;
import com.teo.data.models.Client;
import com.teo.data.models.Employee;
import com.teo.data.models.User;
import com.teo.io.IODevice;
import com.teo.services.AuthenticationService;

import java.util.Date;
import java.util.List;

public class AdminController implements Controller {

    private final AuthenticationService authenticationService;
    private final IODevice ioDevice;

    public AdminController(IODevice ioDevice, AuthenticationService authenticationService) {
        this.ioDevice = ioDevice;
        this.authenticationService = authenticationService;
    }

    @Override
    public void start() {
        AdminOption chosenOption = null;
        while (chosenOption != AdminOption.LOGOUT) {
            ioDevice.showAdminOptions();
            chosenOption = ioDevice.getAdminOptionFromUser();
            switch (chosenOption) {
                case CREATE_NEW_USER:
                    onCreateUserOptionChosen();
                    break;
                case LOGOUT:
                    onLogoutOptionChosen();
                    break;
                case ENTER_NEW_CLIENT:
                    onNewClientOptionChosen();
                    break;
                case SEE_ALL_USERS:
                    onSeeUsersOptionsChosen();
                    break;
                case SEE_ALL_CLIENTS:
                    onSeeClientsOptionChosen();
                    break;
                case SEE_USER_REPORT:
                    onUserReportOptionChosen();
                    break;
                case SEE_ALL_REPORTS:
                    onAllReportsOptionChosen();
                    break;
            }
        }
    }

    private void onAllReportsOptionChosen() {
        List<User> users = UserRepository.getInstance().getAllUsers();
        for (User user : users) {
            showUserReports(user);
        }
    }

    private void onUserReportOptionChosen() {
        String username = ioDevice.getUsernameFromUser();
        User user = UserRepository.getInstance().getUserByUsername(username);
        showUserReports(user);
    }

    private void showUserReports(User user) {
        if(user == null) {
            ioDevice.showNoSuchUserError();
        } else if (user instanceof Admin) {
            ioDevice.showUserNotEmployeeError();
        } else {
            Employee employee = (Employee) user;
            ioDevice.showReports(employee.getReports(), employee);
        }
    }

    private void onSeeClientsOptionChosen() {
        List<Client> allClients = ClientRepository.getInstance().getClients();
        ioDevice.showClients(allClients);
    }

    private void onSeeUsersOptionsChosen() {
        List<User> allUsers = UserRepository.getInstance().getAllUsers();
        ioDevice.showAllUsers(allUsers);
    }

    private void onNewClientOptionChosen() {
        String clientName = ioDevice.getClientNameFromUser();
        String projectName = ioDevice.getProjectNameFromUser();
        Date projectEndDate = ioDevice.getDateFromUser();
        Client client = new Client(clientName, projectName, projectEndDate.getTime());
        ClientRepository.getInstance().createClient(client);
    }

    private void onLogoutOptionChosen() {
        authenticationService.logout();
        NavigationController.getInstance(ioDevice).startLogin();
    }

    private void onCreateUserOptionChosen() {
        int userTypeChosen = ioDevice.getNewUserTypeFromUser();
        String newEmployeeUsername = ioDevice.getNewUserUsernameFromUser();
        String newEmployeePassword = ioDevice.getNewUserPasswordFromUser();
        User newUser = null;
        switch (userTypeChosen) {
            case 1: newUser = new Employee(newEmployeeUsername, newEmployeePassword);; break;
            case 2: newUser = new Admin(newEmployeeUsername, newEmployeePassword);; break;
        }
        UserRepository.getInstance().createUser(newUser);
    }
}
