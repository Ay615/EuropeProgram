package com.unitedcoder.dadastructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        List<String> userName=new ArrayList<>();
        userName.add("Java");
        userName.add("Admin");
        userName.add("student");
        userName.add("learner");
        userName.add("Staff");
        List<String> name=new ArrayList<>();
        name.add("Java");
        name.add("Python");
        name.add("Java Script");
        name.add("C#");
        List<String> s1=userName.subList(0,2);
        List<String> s2=name.subList(0,2);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        userName.addAll(name);
        System.out.println(userName.toString());
        userName.removeAll(name);
        System.out.println(userName.toString());
    }
}
