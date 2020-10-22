package com.unitedcoder.loops;

public class StarDemo2 {
    public static void main(String[] args) {
//*                       *****          1  5
//**                      ****           2  4
//***                     ***            3  3
//****                    **             4  2
//*****                   *              5  1
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
