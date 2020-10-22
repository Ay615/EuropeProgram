package com.unitedcoder.loops;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        //1-100 summary
        int sum=0;
        //scope of variable
        //int i;
        for(int i=1;i<=100;i++){
            sum=sum+i;
            System.out.println(String.format("i=%d sum=%d",i,sum));
        }

        //factorial --5--> 5*4*3*2*1
        Scanner scanner=new Scanner(System.in);//new object
        long numbers=scanner.nextLong();
        int factorialValue=1;
        for(int i=1;i<=numbers;i++){
            factorialValue=factorialValue*i;
            System.out.println(String.format("i=%d factorial=%d",i,factorialValue));
        }



    }

}
