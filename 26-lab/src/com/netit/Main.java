package com.netit;

import com.netit.school.*;
import com.netit.school.Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        School school = new School(
//          new Class("8a", 1, getTeacher(), getStudentList(25), getTeacherList(8)),
//          new Class("9a", 1, getTeacher(), getStudentList(20), getTeacherList(9)),
//          new Class("10a", 1, getTeacher(), getStudentList(30), getTeacherList(10)),
//          new Class("8b", 1, getTeacher(), getStudentList(24), getTeacherList(8)),
//          new Class("9b", 1, getTeacher(), getStudentList(27), getTeacherList(7)),
//          new Class("10b", 1, getTeacher(), getStudentList(29), getTeacherList(12)),
//          new Class("11a", 1, getTeacher(), getStudentList(30), getTeacherList(8)),
//          new Class("11b", 1, getTeacher(), getStudentList(22), getTeacherList(13)),
          new Class("12a", 1, getTeacher(), getStudentList(3), getTeacherList(3)),
          new Class("12b", 1, getTeacher(), getStudentList(2), getTeacherList(4))
        );

        System.out.println(school);

        System.out.println("Average grades per class: \n" + school.getAverageClassGrade());
        System.out.println("Room with smartest kids: \n" + school.getRoomOfClassWithHighestAvgGrades());
        System.out.println("Years of teacher experience per class: \n" + school.getTotalYearsOfExperiencePerClass());
        System.out.println("People with same birthday: \n" + school.getPeopleWithBirthdayOn(10, 10));
        System.out.println("Month with most birthdays: \n" + school.getMonthOfMostBirths());
    }

    private static List<Student> getStudentList(int numOfStudents) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numOfStudents; i++) {
            students.add(getStudent());
        }
        return students;
    }

    private static Student getStudent() {
        return new Student("Student " + getRandomLetter(), getRandomDay(), getRandomMonth(), getRandomYear(), getRandomGrade());
    }

    private static double getRandomGrade() {
        return getPositiveRandomNumber(4) + new Random().nextDouble() + 2;
    }

    private static List<Teacher> getTeacherList(int numOfTeacher) {
        List<Teacher> teachers = new ArrayList<>();
        for (int i = 0; i < numOfTeacher; i++) {
            teachers.add(getTeacher());
        }
        return teachers;
    }

    public static Teacher getTeacher() {
        return new Teacher("Teacher " + getRandomLetter(), getRandomDay(), getRandomMonth(), getRandomYear(), getRandomDay(), getRandomSubject());
    }

    private static Subject getRandomSubject() {
        int enumValueCount = Subject.values().length;
        int enumIndex = getPositiveRandomNumber(enumValueCount);
        return Subject.values()[enumIndex];
    }

    public static char getRandomLetter() {
        return (char) (getPositiveRandomNumber(30) + 60);
    }

    public static int getRandomDay() {
        return getPositiveRandomNumber(30);
    }

    public static int getRandomMonth() {
        return getPositiveRandomNumber(12);
    }

    public static int getRandomYear() {
        return getPositiveRandomNumber(100) + 1900;
    }

    public static int getPositiveRandomNumber(int upperBound) {
        return getPositiveRandomNumber() % upperBound;
    }

    public static int getPositiveRandomNumber() {
        return Math.abs(new Random().nextInt());
    }
}
