package com.unitedcoder.lambdaexpression;

public interface F1 {
    void sum(int a,int b);//compile time error
}
class WithParameter{
    public static void main(String[] args) {
        F1 f1=(a,b)-> System.out.println("Sum of the given value is: "+(a+b));
        f1.sum(10,20);
    }
}
