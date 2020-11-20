package com.netit.school;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private final String name;
    private final int roomNumber;
    private final Teacher mainTeacher;
    private final List<Student> students;
    private final List<Teacher> teachers;

    public Class(String name, int roomNumber, Teacher mainTeacher, List<Student> students, List<Teacher> teachers) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.mainTeacher = mainTeacher;
        this.students = students;
        this.teachers = teachers;
    }

    public Class(String name, int roomNumber, Teacher mainTeacher) {
        this(name, roomNumber, mainTeacher, new ArrayList<>(), new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Teacher getMainTeacher() {
        return mainTeacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "\n--Class " + name + " in room " + roomNumber + " and mainTeacher " + mainTeacher + "\n" +
                "----Students:\n" + students +
                "\n----Teachers:\n" + teachers;
    }
}
