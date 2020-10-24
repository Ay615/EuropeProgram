package com.unitedcoder.dadastructure;

public class TwoDimensionArray {
    public static void main(String[] args) {
        //        int[][] array=new int[3][5];
//        int[][] array1=new int[3][];
//        int[] a[]={};
        int[][] array2=new int[][]{//3  3
                {1,2,3,4},
                {4,5,6},
                {9,10,15,20,40}
        };
        System.out.println(array2.length);//3
        System.out.println(array2[0].length);//4
        System.out.println(array2[1].length);//3
        System.out.println(array2[2].length);//5
        System.out.println(array2[0][1]);
        System.out.println(array2[2][2]);
        int sum=0;
        for(int i=0;i<array2.length;i++){
            for(int j=0;j<array2[i].length;j++){
                System.out.print(array2[i][j]+" ");
                sum=sum+array2[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of two dimension array : "+sum);
    }
}

