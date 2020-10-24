package com.unitedcoder.dadastructure;

import java.util.ArrayList;

public class RetainArrayList {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("test");
        a1.add("Java");
        ArrayList<String> a2=new ArrayList<>();
        a2.add("test");
        a2.add("Selenium");
        a1.retainAll(a2);
        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }
    }
}
