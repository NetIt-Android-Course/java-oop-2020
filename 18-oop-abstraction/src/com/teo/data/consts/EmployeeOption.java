package com.teo.data.consts;

public enum EmployeeOption {
    SEE_ALL_REPORTS(1),
    ENTER_NEW_REPORT(2),
    LOGOUT(3);

    private final int value;
    EmployeeOption(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static EmployeeOption convertToEmployeeOption(int option) {
        for (EmployeeOption employeeOption : values()) {
            if(option == employeeOption.value) return employeeOption;
        }
        return null;
    }
}
