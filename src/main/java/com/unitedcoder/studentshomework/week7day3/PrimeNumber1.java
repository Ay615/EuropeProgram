package com.unitedcoder.studentshomework.week7day3;

import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any integer number: ");
        int number = input.nextInt();
        System.out.printf("Within %d, those are prime numbers: \n", number);
        for(int i=2; i<=number;i++){
            int j;
            for (j=2; j<=i;j++){
                if (i%j==0){
                    break;
                }
            }
            if(i==j){
                System.out.print(i + " ");
            }
            //  10/2  10/3 10/4   10/10

        }
    }
}
