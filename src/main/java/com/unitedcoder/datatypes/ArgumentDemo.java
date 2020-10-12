package com.unitedcoder.datatypes;

public class ArgumentDemo {
    public static void main(String[] args) {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int z=Integer.parseInt(args[2]);
        int sum=x+y+z;
        System.out.println(String.format("%d+%d+%d=%d",x,y,z,sum));


    }
}
