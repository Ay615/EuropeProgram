package com.unitedcoder.datatypes;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        int existingAmount=1000;
        int password=5678;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter you pin number");
        int pin=scanner.nextInt();
        if(pin==password){
            System.out.println("Password is correct ,you can move to next step");
            System.out.println("Please enter the amount of money ");
            int amount=scanner.nextInt();
            if(amount<existingAmount){
                System.out.println("you can check the money");
            }
            else
                System.out.println("Youe existing amount is not enough");
        }
        else{
            System.out.println("Invalid password ,please try again");
        }
    }
}
