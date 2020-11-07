package com.unitedcoder.classconcepts;

public class JavaMethods {
    /* int[] a=new int[]{9,10,3,20,5];
    int maxNumber=0;
        for(int i=0;i<a.length;i++){
        if(maxNumber<a[i]){
            maxNumber=a[i];
        }*/

    public int findMaxNumer(int[] arr){
        int maxNumber=0;
        for(int i=0;i<arr.length;i++){
            if(maxNumber<arr[i]){
                maxNumber=arr[i];
            }
        }
        return maxNumber;


    }

}
