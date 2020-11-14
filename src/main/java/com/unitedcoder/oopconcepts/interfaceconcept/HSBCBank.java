package com.unitedcoder.oopconcepts.interfaceconcept;

public class HSBCBank implements USBank ,UKBank{
    public void credit() {
        System.out.println("HSBC----credit");
    }


    public void debit() {
        System.out.println("HSBC----debit");

    }

    public void transferMoney() {
        System.out.println("HSBC---transfer money");

    }


    public void loan() {

    }
}
