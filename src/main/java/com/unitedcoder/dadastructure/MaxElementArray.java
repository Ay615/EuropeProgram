package com.unitedcoder.dadastructure;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        //max number
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter array length");
        int length=scanner.nextInt();
        //int a[]={10,40,100,80,20,60};//0 10
        int[] a=new int[length];
        int maxNumber=0;
        for(int i=0;i<a.length;i++){
            //a[i]=scanner.nextInt(); 0.0 0.99999
            a[i]=(int)(Math.random()*100+1);
            if(maxNumber<a[i]){
                maxNumber=a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Max number of an array is : "+maxNumber);

    }
}
