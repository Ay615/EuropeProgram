package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo1 {
    public static void main(String[] args) {
        //input number --length---1=0-9  2=10-99  3=100-999
        Scanner scanner=new Scanner(System.in);
        String number=scanner.next();
        if(StringUtils.isNumeric(number)){
            int digitCounts=number.length();
            switch (digitCounts){
                case 1:
                    System.out.println("The number you entered is between 0-9");
                    break;
                case 2:
                    System.out.println("The number you entered is between 10-99");
                    break;
                case 3:
                    System.out.println("The number you entered is between 100-999");
                    break;
            }
        }
        else
            System.out.println("Please enter digit numbers");
    }
}
