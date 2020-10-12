package com.unitedcoder.datatypes;


public class DataTypeDemo1 {
    public static void main(String[] args) {
        //data types : int long double float char boolean
        double x=10;// variable  10.0
        System.out.println(x);
        byte b1=127;
        int i1=1897;
        int i2=67543;
        int i3=i1*i2;//long
        System.out.println(i3);
        float f1=678.897654f;
        System.out.println(1<0);
        System.out.println(8>6);
// 100 * 5 = 500
        //%d %s %f  %s is for any dataTYpe
        int a=100;
        int b=5;
        int d=2;
        int c=a*b;
        System.out.println(a*b);
        System.out.println(c);
        System.out.println(a+" "+"*"+" "+b+"="+c);//hard code
        System.out.println(String.format("%d * %d =%d",a,b,c));//100*5=500
        System.out.println(String.format("%d / %d =%f",b,d,(float)b/d));







    }
}
