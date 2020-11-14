package com.unitedcoder.oopconcepts.inheritancetutorial;

public class Student {
    //parent class super class
    private String firstName;
    private String lastName;
    private String gender;
    private String major;
    private String className;

    public Student() {
    }

    public Student(String firstName, String lastName, String gender, String major, String className) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.major = major;
        this.className = className;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
