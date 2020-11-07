package com.unitedcoder.classconcepts.package1;

public class StudentPrintDemo1 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "Mike", "Male");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getGender());
    }
    }
