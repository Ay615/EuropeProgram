package com.unitedcoder.studentshomework.week7day3;

import java.util.Scanner;

public class PrimeNumber3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any number between 0 and 500:");
        //Don't stop while entering the wrong number.
        while (true) {
            int number=scanner.nextInt();
            if (number >= 1 && number <= 500) {
                System.out.println(String.format("Between 1 and 500, the numbers can be divisible by %d are : ",number));
                for (int i = 1; i <= 500; i++) {
                    if (i % number == 0)
                        System.out.printf(i + ",");
                }
                break;

            } else
                System.out.println("The number you have entered is incorrect!!!\n Please enter a number between 1 and 500 ：");
        }
    }
}
