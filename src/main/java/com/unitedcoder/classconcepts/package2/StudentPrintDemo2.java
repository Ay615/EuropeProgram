package com.unitedcoder.classconcepts.package2;

import com.unitedcoder.classconcepts.package1.Student;

public class StudentPrintDemo2 {
    public static void main(String[] args) {
        Student student=new Student("David","Smith","Male");
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getGender());
    }
}
