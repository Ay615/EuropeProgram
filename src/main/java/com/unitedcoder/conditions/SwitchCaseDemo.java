package com.unitedcoder.conditions;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter day number");
        int dayNumber=input.nextInt();
        //1-7
//        if(dayNumber==1)
//            System.out.println("monday");
//        else if(dayNumber==2)
//            System.out.println("tuesday");
//        else if(dayNumber==3)
//            System.out.println("wednesday");
//        else if(dayNumber==4)
//            System.out.println("thursday");
//        else if(dayNumber==5)
//            System.out.println("friday");
//        else if(dayNumber==6)
//            System.out.println("saturday");
//        else
//            System.out.println("Sunday");
        int d=0;
        switch (dayNumber){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number please enter number from 1-7");
        }
    }
}
