package com.unitedcoder.datatypes;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        //++ plus one  -- minus 1
        int i=1;
        int j=i++;//post increment
        System.out.println(i);//2
        System.out.println(j);//1

        int m=1;
        int n=++m;//pre increment
        System.out.println(m);//2
        System.out.println(n);//2

        int p=2;
        int q=p--;//post decrement
        System.out.println(p);//1
        System.out.println(q);//2

        int c=2;
        int d=--c;//pre decrement
        System.out.println(c);//1
        System.out.println(d);//1

        int i1=1000;
        int j1=i1++;
        System.out.println(i1);//1001
        System.out.println(j1);//1000
        int i2=1000;
        int j2=++i2;
        System.out.println(i2);//1001
        System.out.println(j2);//1001





    }
}
