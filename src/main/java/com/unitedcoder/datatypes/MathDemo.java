package com.unitedcoder.datatypes;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println(Math.max(1000,2000));
        System.out.println(Math.min(300,500));
        System.out.println(Math.sqrt(9));//suqare root
        System.out.println(Math.pow(10,3));
        System.out.println(Math.abs(-200));
        //random function
        //0-1.0  double--0.0--0.9999999
        //0-10
        int randomNumber=(int)(Math.random()*11);
        System.out.println(randomNumber);
        //1-10
        int randomNumber1=(int)(Math.random()*10)+1;
        System.out.println(randomNumber1);








    }
}
