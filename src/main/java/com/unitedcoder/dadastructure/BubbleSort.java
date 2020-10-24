package com.unitedcoder.dadastructure;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={20,50,70,40,30,100};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
