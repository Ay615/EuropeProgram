package com.unitedcoder.classconcepts;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccountStatic.setAccountBalance(30000);
        BankAccountStatic.setAccountNumber(8976544);
        BankAccountStatic.setAccountName("KuveytTurk");
        BankAccountStatic.getAccountInformation();
        BankAccountStatic.withdrowMoney(10000);
    }
}
