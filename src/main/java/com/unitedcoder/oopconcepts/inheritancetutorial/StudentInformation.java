package com.unitedcoder.oopconcepts.inheritancetutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentInformation {
    public static void main(String[] args) {
        Student student=new Student();
        student.setFirstName("AA");
        student.setLastName("BB");

        GraduateStudent graduateStudent=new GraduateStudent();
        graduateStudent.setFirstName("Tom");
        graduateStudent.setLastName("Mike");
        graduateStudent.setMajor("Test Automation");
        graduateStudent.setResearchField("Selenium test");

        //System.out.println(graduateStudent.toString());

        GraduateStudent graduateStudent1=new GraduateStudent();
        graduateStudent1.setFirstName("Danny");
        graduateStudent1.setLastName("David");
        graduateStudent1.setMajor("Java Programmer");
        graduateStudent1.setAdvisorName("Dolkun");
        graduateStudent1.setClassName("United coder");

        List<GraduateStudent> studentList=new ArrayList<>();
        studentList.add(graduateStudent);
        studentList.add(graduateStudent1);
        for(GraduateStudent students:studentList){
            System.out.println(students.toString());
        }





    }
}
