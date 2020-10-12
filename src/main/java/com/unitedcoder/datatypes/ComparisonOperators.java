package com.unitedcoder.datatypes;

public class ComparisonOperators {
    public static void main(String[] args) {
        int i1=100;
        int i2=200;
        System.out.println(i1==i2);//false
        System.out.println(i1!=i2);//true
        System.out.println(i1>i2);//flase
        System.out.println(i1<i2);//true
        System.out.println(i1>=i2);//false
        System.out.println(i1<=i2);//true
        //logical operators
        boolean b1=true;
        boolean b2=false;
        boolean b3=true;
        System.out.println(b1&&b2);//false
        System.out.println(b1||b2);//true
        System.out.println(b1&&b3);//true
        System.out.println(!(b1&&b3));//false
        //bitwise operator
         byte x=100;
         byte y=110;
        System.out.println(x&y);//100
        System.out.println(x|y);//110

        int number1=5;
        int number2=20;
        boolean result1=(number1==5)&&(number2==19);//false
        boolean result2=(number1==5)&&(number2==20);//true
        System.out.println(String.format("result1=%b",result1));
        System.out.println(String.format("result2=%b",result2));
        boolean result3=(number1==5)||(number2==9);//true
        System.out.println(String.format("result3=%b",result3));





    }
}
