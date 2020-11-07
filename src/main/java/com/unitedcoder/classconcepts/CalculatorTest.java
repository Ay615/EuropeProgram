package com.unitedcoder.classconcepts;


public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.calculatorInfo();
        System.out.println(c.addTwoNumbers(100,300));
        System.out.println(c.addTwoNumbers(200,500));
        System.out.println(c.addTwoNumbers("12","89"));
        System.out.println(c.addTwoNumbers("12a","89"));
        System.out.println(c.addMultipleNumbers(100,900,789,650,453,976));
        System.out.println(c.subtarctTwoNumbers(200,250));
        System.out.println("********Array Max Number*******");
        JavaMethods methods=new JavaMethods();
        System.out.println(methods.findMaxNumer(new int[]{10,5,90,2,89}));
        System.out.println(methods.findMaxNumer(new int[]{10,5,90,2,200,89,20,500}));
    }
}
