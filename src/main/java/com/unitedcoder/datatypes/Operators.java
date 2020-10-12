package com.unitedcoder.datatypes;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic operators
        int i=0;
//        int i=0;
        int j=i;
        i++;//+1
        j++;
        System.out.println(i);
        System.out.println(j);
        i++;
        j++;
        System.out.println(i);
        System.out.println(j);
        i--;//-1
        j--;
        System.out.println(i);
        System.out.println(j);
        i--;
        j--;
        System.out.println(i);
        System.out.println(j);
        i--;
        j--;
        System.out.println(i);
        System.out.println(j);
        //calculate area of rectangle w*h
        //calculate perimeter of rectangle2*(w+h)
        int width=25;
        int height=15;
        int area=width*height;
        int perimeterArea=2*(width+height);
        System.out.println(String.format("Area of rectangle is %d",area));
        System.out.println(String.format("perimeter of rectangle is %d",perimeterArea));
        float divResult=width/height;
        System.out.printf("\n divResult=%f \n",divResult);
        //% is remainder
        System.out.println(5%2);
        //Assignment operators +=
        int num1=100;
        num1+=5;//num1=num1+2
        System.out.println(num1);
        num1-=20;//num1=num1-20
        System.out.println(num1);
        num1*=2;//num1=num1*2
        System.out.println(num1);
        num1/=2;//num1=num1/2
        System.out.println(num1);





    }
}
