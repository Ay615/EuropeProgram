package com.unitedcoder.classconcepts;

import org.apache.commons.lang3.StringUtils;

public class Calculator {
    //method for print calculator information
    public void calculatorInfo(){
        System.out.println("Thanks for using this simple Calculator");
        System.out.println("Hope you enjoy using it");
    }
    //method for add two numbers
    public int addTwoNumbers(int i1,int i2){
        int sum=i1+i2;
        return sum;
    }
    public long addTwoNumbers(String s1,String s2){
        if(StringUtils.isNumeric(s1)&&StringUtils.isNumeric(s2)){
            long sum=Long.parseLong(s1)+Long.parseLong(s2);
            return sum;
        }
        else {
            System.out.println("Please provide numeric String");
            return 0;
        }
    }
    //add multiple numbers  6 8 9 10 100
    public long addMultipleNumbers(long...numbers){
        long sum=0;
        for(long eachNumber:numbers){
            sum=sum+eachNumber;
        }
        return sum;
    }
    //subtract two number
    public int subtarctTwoNumbers(int i1,int i2){
        //if(i1>i2){
        int result=Math.abs(i1-i2);
        return result;
//        }
//        else {
//            int result1=i2-i1;
//            return result1;
//        }
    }
}
