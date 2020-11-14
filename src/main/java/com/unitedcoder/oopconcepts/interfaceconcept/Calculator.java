package com.unitedcoder.oopconcepts.interfaceconcept;

public  class Calculator implements ISimpleCalculator,IScientificCalculator {


    public double addTwoNumbers(double d1, double d2) {
        double sum=d1+d2;
        System.out.println(String.format("%.2f+%.2f=%.2f",d1,d2,sum));
        return sum;
    }

    public int multiplyTwoNumbers(int i1, int i2) {
        int result=i1*i2;
        System.out.println(String.format("%d*%d=%d",i1,i2,result));
        return result;
    }

    public long substractTwoNumbers(long l1, long l2) {
        System.out.println(String.format("%d-%d=%d",l1,l2,l1-l2));
        return l1-l2;
    }

    public double divideTwoNumbers(double d1, double d2) {
        if(d2!=0){
            float result=(float)(d1/d2);
            return result;
        }
        else {
            System.out.println("Your denominator is zero");
            return 0;
        }
    }


    public double calculatePower(int base, int power) {
        double r=Math.pow(base,power);
        return r;
    }


    public double calculateSquareRoot(long l1) {
        double s=Math.sqrt(l1);
        return s;
    }

    public double calculateAbsoluteValue(int x) {
        double abs=Math.abs(x);
        return abs;
    }
}
