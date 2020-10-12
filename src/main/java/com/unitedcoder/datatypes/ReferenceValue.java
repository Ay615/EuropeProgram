package com.unitedcoder.datatypes;

public class ReferenceValue {
    public static void main(String[] args) {
        //x=200 y=100
        int x=100;
        int y=200;
        int temp=x;
         x=y;//x=200
        y=temp;
        System.out.println("value of x is "+x);
        System.out.println("Value of y is "+y);





    }
}
