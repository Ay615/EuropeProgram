package com.unitedcoder.datatypes;

public class StringDemo3 {
    public static void main(String[] args) {
        String course="Java selenium Test Automation Courses";
        System.out.println(course.length());//starts from 1
        System.out.println(course.indexOf("s"));
        System.out.println(course.indexOf("Test"));
        System.out.println(course.lastIndexOf("s"));
        System.out.println(course.indexOf('s',course.indexOf('s')+1));
        System.out.println(course.indexOf('s',course.indexOf('s'+1)+1));
        System.out.println(course.toLowerCase());
        System.out.println(course.toUpperCase());
        course=course.replace("Java","Python");
        System.out.println(course);
        String status="  All test passed  ";
        System.out.println(status.length());
        status=status.trim();
        System.out.println(status.length());
        status=status.replace(" ","");
        System.out.println(status);
        //substring
        course=course.replace("Python","Java");
        System.out.println(course);
        //System.out.println(course.substring(5,13));
        int beginIndex=course.indexOf("s");//5
        int endIndex=beginIndex+"selenium".length();//13
        System.out.println(course.substring(beginIndex,endIndex));
        //create account
        String date="03-09-2020";//03/09/2020
        date=date.replace("-","/");
        System.out.println(date);

        String s1="Java";
        String s2="java";
        String s3="Java is fun";
        System.out.println(s1.equals(s2));//flase
        System.out.println(s1.equalsIgnoreCase(s2));//true
        System.out.println(s3.contains(s1));//true



















    }
}
