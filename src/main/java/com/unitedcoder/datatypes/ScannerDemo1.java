package com.unitedcoder.datatypes;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //school name address zip code   print full address
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your school name");
        String schoolName=input.nextLine();
        System.out.println("Please enter your school address");
        String schoolAddress=input.nextLine();
        System.out.println("Please enter zip code");
        String zipCode=input.next();
        System.out.println(String.format("Your school full address is %s %s %s",schoolName,schoolAddress,zipCode));

    }
}
