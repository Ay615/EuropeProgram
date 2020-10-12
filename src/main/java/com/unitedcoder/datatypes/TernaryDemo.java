package com.unitedcoder.datatypes;

public class TernaryDemo {
    public static void main(String[] args) {
        int m=12;
        int n=5;
        int max=(m>n)?m:n;
        System.out.println(String.format("Max value of %d and %d is %d",m,n,max));
        int min=(n<m)?n:m;
        System.out.println(String.format("min value of %d and %d is %d",n,m,min));



    }
}
