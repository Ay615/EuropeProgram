package com.unitedcoder.studentshomework.week7day3;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int r=0;
        for (int i = 2; i<=num; i++) {     //all numbers
            int j=2;
            while (i>j) {
                if (i%j==0)
                    break;  //not a prime number,out of loop
                j++;
            }
            if (j==i) {
                System.out.print(i+ "\t");
                r++;             //calculate the number of outputs
                if (r%20==0)    //After every 10 outputs, a line feed.
                    System.out.println();
            }
        }
    }
}
