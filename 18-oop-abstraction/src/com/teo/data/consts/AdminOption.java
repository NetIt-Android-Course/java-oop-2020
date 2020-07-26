package com.teo.data.consts;

public enum AdminOption {
    SEE_ALL_USERS(1),
    SEE_ALL_CLIENTS(2),
    ENTER_NEW_CLIENT(3),
    CREATE_NEW_USER(4),
    SEE_USER_REPORT(5),
    SEE_ALL_REPORTS(6),
    LOGOUT(7);

    private final int value;
    AdminOption(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    public static AdminOption convertToAdminOption(int option) {
        for (AdminOption adminOption : values()) {
            if(option == adminOption.value) return adminOption;
        }
        return null;
    }
}
