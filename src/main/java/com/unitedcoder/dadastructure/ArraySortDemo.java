package com.unitedcoder.dadastructure;

import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        //sort array element  ascending  descending order
        int[] arr=new int[]{10,80,5,15,4,90,60};
        //sort an array in ascending order
        System.out.println(Arrays.toString(arr));
        //Arrays object
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //descending order
        for(int i=arr.length-1;i>=0;i--){//length=7 90 -6
            System.out.print(arr[i]+" ");
        }
    }
}
