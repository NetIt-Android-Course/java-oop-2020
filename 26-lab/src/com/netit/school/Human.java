package com.netit.school;

import java.util.Date;

public class Human {

    protected String name;
    protected long dateOfBirthTimestamp;

    public String getName() {
        return name;
    }

    public long getDateOfBirthTimestamp() {
        return dateOfBirthTimestamp;
    }

    public int getDayOfBirth() {
        return getDateOfBirth().getDate();
    }

    public int getMonthOfBirth() {
        return getDateOfBirth().getMonth();
    }

    public int getYearOfBirth() {
        return getDateOfBirth().getYear();
    }

    public Date getDateOfBirth() {
        return new Date(dateOfBirthTimestamp);
    }
}
