package com.unitedcoder.loops;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class ATMLoopDemo {
    public static void main(String[] args) {
        //56tr
        double accountBalance = 5000;
        int pinNumber = 414415;
        Scanner input = new Scanner(System.in);
        System.out.println("Pleese enter your pin number");
        int chance=3;
        int i=0;
        do{
            i++;
            String myPin = input.next();
            if (StringUtils.isNumeric(myPin) && Integer.parseInt(myPin) == pinNumber) {
                System.out.println("Please enter amount of withDraw");
                double money = input.nextDouble();
                if (money < accountBalance) {
                    System.out.println("Please take the cash" + money);
                    System.out.println("Your balance is :" + String.valueOf(accountBalance - money));
                } else {
                    System.out.println("Your balance was " + accountBalance);
                    System.out.println("you dont have enough money to withdraw");
                }
                break;

            } else {
                System.out.println("Your pin number is incorrect (or invalid) please try again");
                System.out.println(String.format("This is %d times you are trying ,You only can try %d time",i,chance-i));
            }
        }while (i<chance);

    }
}
