package com.unitedcoder.loops;

public class WhileLoop {
    public static void main(String[] args) {
        //1-100 even odd numbers
        int i=1;
        while (i<=100){
            if(i%2!=0){
                System.out.println(i);
            }
            i++;
        }
    }
}
