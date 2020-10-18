package com.unitedcoder.collectioninterviewpoint;

public class ArraysDemo1 {
    public static void main(String[] args) {
        maxDifference(new int[]{9,7,4,6,3,5,2});

    }

    //1.method for print max difference adjacent index of array
    public static void maxDifference(int[] arr){
        int maxDifference=0;
        for(int i=0;i<arr.length-1;i++){
            if(maxDifference<arr[i+1]-arr[i]){
                    maxDifference=arr[i+1]-arr[i];
            }
        }
        System.out.println(maxDifference);
    }


}
