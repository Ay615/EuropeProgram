package com.unitedcoder.studentshomework.week7day1;

import java.util.Scanner;

public class TaxHomeWork1 {
    public static void main(String[] args) {
        System.out.println("Please input your salary for the year to calculate your taxes: ");
        Scanner input = new Scanner(System.in);
        double annualSalary = input.nextDouble();
        System.out.println("You entered " + annualSalary);
        System.out.println("please enter your status :   " + "( plz enter single or married) ");
        String status = input.next();
        double tax =0;
        if (status.equalsIgnoreCase("single")&& annualSalary <= 32000) {             // Salary less than or equal to 32k SINGLE 10%
            tax = annualSalary * 0.1;
            System.out.println("tax" + tax);
        } else if (status.equalsIgnoreCase("single") && annualSalary > 32000) {        // Salary more than 32k SINGLE 25%
            tax = (annualSalary - 32000) * 0.25 + 32000 * 0.1;
            System.out.println("tax" + tax);
        } else if (status.equalsIgnoreCase("married") && annualSalary <= 64000) {      // Salary less than or equal to 64k
            tax = annualSalary * 0.1;
            System.out.println("tax" + tax);
        } else if (status.equalsIgnoreCase("married") && annualSalary > 64000) {       //Salary more than 64k MARRIED 25%
            tax = (annualSalary - 64000) * 0.25 + 64000 * 0.1;
            System.out.println("tax" + tax);
        } else
            System.out.println("invalid status ,please just type single or married ");

    }
}
