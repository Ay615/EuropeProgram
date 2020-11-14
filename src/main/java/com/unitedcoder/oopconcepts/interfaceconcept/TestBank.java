package com.unitedcoder.oopconcepts.interfaceconcept;

public class TestBank {
    public static void main(String[] args) {
        //we cannot insantiate an interface(Create new object
        USBank bank=new HSBCBank();
        bank.credit();
        bank.debit();
        bank.transferMoney();
        System.out.println(USBank.min_balance);

    }
    
}
