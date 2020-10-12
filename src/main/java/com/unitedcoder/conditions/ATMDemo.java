package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMDemo {
    public static void main(String[] args) {
        //56tr
        double accountBalance=5000;
        int pinNumber=414415;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your pin number");
        String myPin=input.next();
        if(StringUtils.isNumeric(myPin)&&Integer.parseInt(myPin)==pinNumber){
            System.out.println("Please enter amount of withDraw");
            double money=input.nextDouble();
            if(money<accountBalance){
                System.out.println("Please take the cash"+money);
                System.out.println("Your balance is :"+String.valueOf(accountBalance-money));
            }
            else{
                System.out.println("Your balance was "+accountBalance);
                System.out.println("you dont have enough money to withdraw");
            }
        }
        else{
            System.out.println("Your pin number is incorrect (or invalid) please enter valid digit pin number");
    }}
}
