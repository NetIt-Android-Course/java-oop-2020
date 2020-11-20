package com.netit.school;

import java.util.Date;

public class Teacher extends Human {

    private final int yearsOfExperience;
    private final Subject subject;

    public Teacher(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, int yearsOfExperience, Subject subject) {
        this.name = name;
        this.dateOfBirthTimestamp = new Date(yearOfBirth, monthOfBirth, dayOfBirth).getTime();
        this.yearsOfExperience = yearsOfExperience;
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return '\n' + name +
                " with yearsOfExp " + yearsOfExperience +
                " teaching " + subject +
                " and dateOfBirth " + getDateOfBirth().toString();
    }
}
