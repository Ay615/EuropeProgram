package com.unitedcoder.dadastructure;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] b=new int[]{10,20,30,40};
        System.out.println(b[2]);
        System.out.println(b[1]);

        for(int elements:b){
            System.out.println(elements);
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println(Arrays.toString(b));
    }
}
