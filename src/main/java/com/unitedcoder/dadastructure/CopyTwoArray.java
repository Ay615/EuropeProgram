package com.unitedcoder.dadastructure;

import java.util.Arrays;

public class CopyTwoArray {
    public static void main(String[] args) {
        int[] a1={10,45,80,60};
        int[] a2= Arrays.copyOf(a1,8);
        System.out.println(Arrays.toString(a2));
        //int default value 0  String null
        String[] s1={"A","B","C"};
        String[] s2=Arrays.copyOf(s1,5);
        System.out.println(Arrays.toString(s2));
        //use algorithm to copy two array
        int[] arra1={10,20,30};
        int[] arra2=new int[arra1.length];
        for(int i=0;i<arra1.length;i++){
            arra2[i]=arra1[i];
        }
        System.out.println(Arrays.toString(arra2));
    }
}
