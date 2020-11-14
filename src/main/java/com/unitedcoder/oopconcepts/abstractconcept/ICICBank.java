package com.unitedcoder.oopconcepts.abstractconcept;

import com.unitedcoder.oopconcepts.interfaceconcept.USBank;

public class ICICBank extends Bank implements USBank {
    public void loan() {
        System.out.println("Bank loan");
    }

    public void transferMoney() {

    }
}
