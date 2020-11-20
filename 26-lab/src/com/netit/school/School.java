package com.netit.school;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

    private final List<Class> allClasses;

    public School(List<Class> allClasses) {
        this.allClasses = allClasses;
    }

    public School(Class... classes) {
        this.allClasses = Arrays.asList(classes);
    }

    @Override
    public String toString() {
        return allClasses.toString();
    }

    public Map<String, Double> getAverageClassGrade() {
        return allClasses.stream()
                .collect(Collectors.toMap(
                        Class::getName,
                        aClass -> aClass.getStudents().stream()
                                .map(Student::getAverageGrade)
                                .reduce((aDouble, aDouble2) -> (aDouble + aDouble2) / 2.0).get()));
    }

    public int getRoomOfClassWithHighestAvgGrades() {
        return allClasses.stream()
                .map(aClass -> new Pair<Integer, Double>(aClass.getRoomNumber(),
                        aClass.getStudents().stream()
                                .map(student -> student.getAverageGrade())
                                .reduce((aDouble, aDouble2) -> (aDouble + aDouble2) / 2.0)
                                .get()))
                .sorted((o1, o2) -> o1.data2 > o2.data2 ? -1 : 1)
                .limit(1)
                .collect(Collectors.toList())
                .get(0)
                .data1;
    }

    public Map<String, Integer> getTotalYearsOfExperiencePerClass() {
        return allClasses.stream()
                .collect(Collectors.toMap(aClass -> aClass.getName(),
                        aClass -> aClass.getTeachers().stream()
                                .map(teacher -> teacher.getYearsOfExperience())
                                .reduce((yearsOfExperience, yearsOfExperience2) -> yearsOfExperience + yearsOfExperience2)
                                .get()));

    }

    public List<Human> getPeopleWithBirthdayOn(int day, int month) {
        return allClasses.stream()
                .flatMap(aClass -> Stream.concat(aClass.getStudents().stream(), aClass.getTeachers().stream()))
                .filter(human -> human.getDayOfBirth() == day && human.getMonthOfBirth() == month)
                .collect(Collectors.toList());
    }

    public int getMonthOfMostBirths() {
        Map<Integer, List<Human>> collect = allClasses.stream()
                .flatMap(aClass -> Stream.concat(aClass.getStudents().stream(), aClass.getTeachers().stream()))
                .collect(Collectors.groupingBy(o -> o.getMonthOfBirth()));
        return collect.keySet().stream()
                .sorted((o1, o2) -> collect.get(o1).size() > collect.get(o2).size() ? -1 : 1)
                .collect(Collectors.toList())
                .get(0);
    }

    class Pair<T, V> {
        public T data1;
        public V data2;

        public Pair(T data1, V data2) {
            this.data1 = data1;
            this.data2 = data2;
        }
    }
}
