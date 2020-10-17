package com.unitedcoder.loops;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        //Scanner input multiple numbers 0 terminate   negative numbers positive numbers count
        Scanner input=new Scanner(System.in);
        int negativeNumbersCount=0;
        int positiveNumbersCount=0;

        while (true){
            int numbers=input.nextInt();
            if(numbers>0){
                positiveNumbersCount++;
            }
            else if(numbers<0){
                negativeNumbersCount++;
            }
            else
                break;
        }
        System.out.println("Negative numbers Count is : "+negativeNumbersCount);
        System.out.println("Positive numbers Count is : "+positiveNumbersCount);

    }
}
