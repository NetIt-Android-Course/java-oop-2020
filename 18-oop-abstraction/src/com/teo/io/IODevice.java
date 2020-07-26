package com.teo.io;

import com.teo.data.consts.AdminOption;
import com.teo.data.consts.EmployeeOption;
import com.teo.data.models.Client;
import com.teo.data.models.DailyReport;
import com.teo.data.models.User;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public interface IODevice {

    String getPasswordFromUser();
    String getUsernameFromUser();
    void showErrorWrongLoginCredentials();
    void showAdminOptions();
    void showEmployeeOptions();

    AdminOption getAdminOptionFromUser();
    int getNewUserTypeFromUser();

    String getNewUserUsernameFromUser();

    String getNewUserPasswordFromUser();

    void showLoginMessage();

    String getClientNameFromUser();

    String getProjectNameFromUser();

    Date getDateFromUser();

    void showAllUsers(List<User> allUsers);

    void showClients(List<Client> allClients);

    EmployeeOption getEmployeeOptionFromUser();

    double getHoursWorkedFromUser();

    void showNoSuchClientError();

    void showReports(Collection<DailyReport> reports, User user);

    void showNoSuchUserError();

    void showUserNotEmployeeError();
}
