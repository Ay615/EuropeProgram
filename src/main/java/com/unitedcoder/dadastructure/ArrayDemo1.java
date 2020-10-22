package com.unitedcoder.dadastructure;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //define an integer array
        int[] a=new int[5];//integer array object
        a[0]=100;
        a[2]=300;
        a[1]=200;
        a[4]=500;
        a[3]=400;
        System.out.println(a[3]);
        System.out.println(a[4]);

        for(int i=0;i<=a.length-1;i++){//0-5
            System.out.print(a[i]+"  ");//a[0]  a[1]  a[2] a[3] a[4]  a[5]
        }
    }
}
