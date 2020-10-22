package com.unitedcoder.loops;

public class LoopContinueDemo {
    public static void main(String[] args) {
        for(int j=1;j<=10;j++){//1 2 3 4 5 6 7 8 9 10
            if(j%4==0)//4 8
                continue;
            System.out.println(j);
        }
    }
}
