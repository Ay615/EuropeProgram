package com.unitedcoder.dadastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VerifyOrder {
    public static void main(String[] args) {
        List<String> phoneList=new ArrayList<>();
        phoneList.add("Sumsung");
        phoneList.add("Ihone");
        phoneList.add("Nokia");
        phoneList.add("Motorola");
        phoneList.add("LG");
        String list=phoneList.toString();
        System.out.println(phoneList.toString());
        Collections.sort(phoneList);
        String list1=phoneList.toString();
        System.out.println(list.equals(list1));

//        List<String> copiedList=new ArrayList<>();
//        copiedList.addAll(phoneList);
//        Collections.sort(copiedList);
//        System.out.println(copiedList.toString());
//        boolean b=copiedList.equals(phoneList);
//        if(b)
//        System.out.println("Phone list is in sorted order");
//        else
//            System.out.println("Phone list is not in listed order");

    }
}
