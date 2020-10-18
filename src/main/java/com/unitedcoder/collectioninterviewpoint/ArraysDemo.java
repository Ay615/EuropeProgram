package com.unitedcoder.collectioninterviewpoint;

public class ArraysDemo {
    public static void main(String[] args) {
        System.out.println(sumOfArrayElement(new int[]{1, 3, 5, 6, 9}));
        multiplication(3,4);

    }
    //1.method for calculate sum of the array element
    public static int sumOfArrayElement(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    //2. write a method for multiply two numbers without using multiplication symble
    public static void multiplication(int x,int y){
        int multiply=0;
        for(int i=1;i<=y;i++){
            multiply+=x;
        }
        System.out.println(multiply);
    }
}
