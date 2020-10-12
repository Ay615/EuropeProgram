package com.unitedcoder.javabasics;

public class Hello {
    public static void main(String[] args) {
          for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                long sum=i*j;
                System.out.print(String.format("%d * %d= %d  ",i,j,sum));
            }
            System.out.println();

        }

    }
    //length()  indexOf trim() replace
    //method  *5
    public static long multiply(int number2,int number){
        return number2*number;
    }
    public static int sum(){
       return  7;
    }

}
