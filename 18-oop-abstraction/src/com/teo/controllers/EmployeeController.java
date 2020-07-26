package com.teo.controllers;

import com.teo.data.ClientRepository;
import com.teo.data.UserRepository;
import com.teo.data.consts.EmployeeOption;
import com.teo.data.models.Client;
import com.teo.data.models.DailyReport;
import com.teo.data.models.Employee;
import com.teo.io.IODevice;
import com.teo.services.AuthenticationService;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class EmployeeController implements Controller {

    private final AuthenticationService authenticationService;
    private final IODevice ioDevice;

    public EmployeeController(IODevice ioDevice, AuthenticationService authenticationService) {
        this.ioDevice = ioDevice;
        this.authenticationService = authenticationService;
    }

    @Override
    public void start() {
        EmployeeOption chosenOption = null;
        while (chosenOption != EmployeeOption.LOGOUT) {
            ioDevice.showEmployeeOptions();
            chosenOption = ioDevice.getEmployeeOptionFromUser();
            switch (chosenOption) {
                case LOGOUT:
                    onLogoutOptionChosen();
                    break;
                case ENTER_NEW_REPORT:
                    onNewReportOptionChosen();
                    break;
                case SEE_ALL_REPORTS:
                    onSeeReportsOptionChosen();
                    break;
            }
        }
    }

    private void onSeeReportsOptionChosen() {
        Collection<DailyReport> reports = ((Employee) authenticationService.getLoggedUser()).getReports();
        ioDevice.showReports(reports, authenticationService.getLoggedUser());
    }

    private void onNewReportOptionChosen() {
        Date reportDate = ioDevice.getDateFromUser();
        String clientName = ioDevice.getClientNameFromUser();
        double hoursWorked = ioDevice.getHoursWorkedFromUser();
        Client client = ClientRepository.getInstance().getClientByName(clientName);

        if(client == null) {
            ioDevice.showNoSuchClientError();
            return;
        }

        ((Employee) authenticationService.getLoggedUser()).addReport(
                reportDate.getDate(),
                reportDate.getMonth() + 1,
                reportDate.getYear() + 1900,
                client,
                hoursWorked);
    }

    private void onLogoutOptionChosen() {
        authenticationService.logout();
        NavigationController.getInstance(ioDevice).startLogin();
    }
}
