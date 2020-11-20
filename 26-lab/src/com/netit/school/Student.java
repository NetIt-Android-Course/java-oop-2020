package com.netit.school;

import java.util.Date;

public class Student extends Human {

    private final double averageGrade;

    public Student(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth, double averageGrade) {
        this.name = name;
        this.dateOfBirthTimestamp = new Date(yearOfBirth, monthOfBirth, dayOfBirth).getTime();
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return '\n' + name +
                " with averageGrade " + averageGrade +
                "and dateOfBirth " + getDateOfBirth().toString();
    }
}
