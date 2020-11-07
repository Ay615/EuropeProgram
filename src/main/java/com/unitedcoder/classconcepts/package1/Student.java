package com.unitedcoder.classconcepts.package1;

public class Student {
    private String firstName;
    private String lastName;
    private String gender;

    public Student() {
    }

    public Student(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }
}
