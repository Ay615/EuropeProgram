package com.unitedcoder.datatypes;

import java.util.Scanner;

public class ConsoleInputDemo {
    public static void main(String[] args) {
        //Scanner Object
        Scanner input=new Scanner(System.in);
        System.out.println("please enter first number:");
        int x=input.nextInt();
        System.out.println("please enter second number:");
        int y=input.nextInt();
        System.out.println("please enter Third number:");
        int z=input.nextInt();
        int sum=x+y+z;
        System.out.println(String.format("%d+%d+%d=%d",x,y,z,sum));

    }
}
