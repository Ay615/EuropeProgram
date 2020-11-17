package com.unitedcoder.oopconcepts.abstractconcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankTest {
    public static void main(String[] args) {
        //cannot insnatiate an abstract class
        Bank bank=new ICICBank();
        bank.loan();
        bank.credit();
        bank.debit();
        bank.balance=1000;
        System.out.println(bank.amount);
        System.out.println(bank.balance);
        System.out.println(Bank.a);
        WebDriver driver=new ChromeDriver();
       
    }
}
