package com.unitedcoder.conditions;


import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        //number1 number2 number3
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int number1=input.nextInt();
        System.out.println("Please enter second number");
        int number2=input.nextInt();
        System.out.println("Please enter Third number");
        int number3=input.nextInt();
        if(number1>number2&&number1>number3){
            System.out.println("number1 is the biggest number ");
        }
        else if(number2>number3)
             System.out.println("number2 is the biggest");



        else
           System.out.println("number3 is the biggest");








    }
}
