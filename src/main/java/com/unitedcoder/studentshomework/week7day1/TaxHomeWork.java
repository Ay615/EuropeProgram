package com.unitedcoder.studentshomework.week7day1;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class TaxHomeWork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tax=0;
        System.out.println("Enter your annual salary: ");
        String annualSalary = input.next();

        if (StringUtils.isNumeric(annualSalary)) {

            int salary = Integer.parseInt(annualSalary);
            System.out.println("Enter your tax filing status (single/married): ");
            String taxFilingStatus = input.next();
            boolean  single = taxFilingStatus.equalsIgnoreCase("single");
            boolean  married = taxFilingStatus.equalsIgnoreCase("married");
            if (single || married) {

                if ((single && salary > 32000) || (married && salary > 64000)) {
                    System.out.printf("\nYour annual salary is %d$.\n"+
                            "You are %s.\n", salary, taxFilingStatus.toLowerCase());
                    //use switch for calculate tax
                    switch (taxFilingStatus.toLowerCase()){
                        case "single":
                            tax = (32000*0.1)+(salary-32000)*0.25;//tax = salary*0.25-4800
                            System.out.println("So you have to pay 10% tax for the $32,000 of your annual salary; pay 25% tax for the annual salary over $32,000.");
                            break;
                        case "married":
                            tax = (64000*0.1)+(salary-64000)*0.25;//tax = salary*0.25-9600
                            System.out.println("So you have to pay 10% tax for the $64,000 of your annual salary; pay 25% tax for the annual salary over $64,000.");
                    }
                    System.out.printf("Thus your total tax is %.2f$.\n", tax);
                }
                if ((single && salary <= 32000) || (married && salary <= 64000)) {
                    tax = 0.1 * salary;
                    System.out.printf("\nYour annual salary is %d$.\n" +
                            "You are %s.\n" +
                            "So you have to pay 10%% tax for your annual salary.\n" +
                            "Thus your total tax is %.0f$.\n", salary, taxFilingStatus.toLowerCase(), tax);

                }
            }
            else
                System.out.println("Control your spelling, type \"single\" or \"married\" " +
                        "(system is not case sensitive).");
        }
        else
            System.out.println("You should enter numeric type and the number you entered should not be minus.");
    }
}
