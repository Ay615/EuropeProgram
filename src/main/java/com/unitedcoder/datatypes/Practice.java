package com.unitedcoder.datatypes;

public class Practice {
    public static void main(String[] args) {
        int a=100;
        int b=a++;//a=101
        int c=++a;//102
        System.out.println(b);//100
        System.out.println(c);//102

        int a1=50;
        int b1=100+(a1++);//100+50=150 =b   a1=51
        int c1=40+(++a1);//a1=52   52+40=92=c1
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        //a--  --a

        //&    &&
       boolean b2=false;
        int number=100;
        if(b2&&(number++>0)){
            System.out.println("True");
        }
        else
            System.out.println("false");
        System.out.println("number is :"+number);

        int num1=100;
        if(b2&(num1++)>0){
            System.out.println("True");
        }
        else
            System.out.println("false");
        System.out.println("number is :"+num1);








    }
}
