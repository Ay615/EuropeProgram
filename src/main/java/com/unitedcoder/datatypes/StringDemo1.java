package com.unitedcoder.datatypes;

public class StringDemo1 {
    public static void main(String[] args) {
        //primitive datatype , String is non-primitive datatype
        String country = "USA";//string literal
        String city = "LA";
        String s1 = new String("name");//string object
        String s2 = new String("name");
        String major = "doctor";
        String major1 = "doctor";
        System.out.println(s1 == s2);//false
        System.out.println(major == major1);//true
        System.out.println(major);
        System.out.println(major1);
        //String concatination
        String s3 = "Hello";
        String s4 = "World";
        String s6 = " ";
        String s7 = ",";
        String s5 = "It is a fine day today.";
        System.out.println(s3+s6+s4+s7+s5);


    }
}
