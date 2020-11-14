package com.unitedcoder.oopconcepts.interfaceconcept;

public class TestCalculator {
    public static void main(String[] args) {
        ISimpleCalculator iSimpleCalculator=new Calculator();
        iSimpleCalculator.addTwoNumbers(10,40);
        iSimpleCalculator.multiplyTwoNumbers(40,5);
        iSimpleCalculator.divideTwoNumbers(10,5);
        iSimpleCalculator.substractTwoNumbers(100,50);
        System.out.println("****Scientific Calculator*****");
        IScientificCalculator iScientificCalculator=new Calculator();
        System.out.println(iScientificCalculator.calculatePower(10,2));
        System.out.println(iScientificCalculator.calculateAbsoluteValue(-20));
        System.out.println(iScientificCalculator.calculateSquareRoot(9));
    }
}
