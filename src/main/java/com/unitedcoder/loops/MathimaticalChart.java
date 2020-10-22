package com.unitedcoder.loops;

public class MathimaticalChart {
    public static void main(String[] args) {
        //row =9   colum increase by row number

        for(int i=1;i<=9;i++){// i=1  2 3
            for(int j=1;j<=i;j++){// j<=1  j<=2 j<=3
                System.out.print(String.format("%d * %d= %d \t",i,j,i*j));
                //1*1=1    2*1=2 2*2=4 3*1=3 3*2=6 3*3=9
            }
            System.out.println();
        }






    }
}

