package com.unitedcoder.oopconcepts.interfaceconcept;

public interface USBank {
    //final static by default
    int min_balance=10000;
    //no method body(method implementation)
    //all methods by default is public
     void credit();
     void debit();
     void transferMoney();

}
