package com.unitedcoder.oopconcepts.abstractconcept;

public abstract class Bank {
    int balance;
    final int amount=100000;
    final static int a=19987;
    //abstract method
    public abstract void loan();
    //non abstract method
    public void credit(){
        System.out.println("Bank credit");
    }
    public void debit(){
        System.out.println("Bank debit");
    }
}
