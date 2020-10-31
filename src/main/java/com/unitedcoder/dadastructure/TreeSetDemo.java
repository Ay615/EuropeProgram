package com.unitedcoder.dadastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set1=new HashSet<>();
        set1.add(30);
        set1.add(20);
        set1.add(90);
        set1.add(40);
        set1.add(30);
        System.out.println(set1.toString());
        Set<Integer> set2=new TreeSet<>();
        set2.add(50);
        set2.add(40);
        set2.add(15);
        set2.add(30);
        System.out.println(set2.toString());
        Set<Integer>  set3=new LinkedHashSet<>();
        set3.add(10);
        set3.add(80);
        set3.add(70);
        set3.add(90);
        System.out.println(set3.toString());

    }
}
