package com.unitedcoder.dadastructure;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String s="Hello_Selenium_Java_Automation";
        String h="Toyota,Honda,BMW";
        String[] arr=s.split("_");
        for(String elements:arr){
            System.out.println(elements);
        }
        System.out.println(Arrays.toString(arr));
        String[] arr1=h.split(",");
        for(String a:arr1){
            System.out.print(a+" ");
        }
    }
}
