package com.unitedcoder.classconcepts;

public class BankAccountStatic {
    private static double accountBalance;
    private static String accountName;
    private static int accountNumber;

    public BankAccountStatic() {
    }

    public static double getAccountBalance() {
        return accountBalance;
    }

    public static void setAccountBalance(double accountBalance) {
        BankAccountStatic.accountBalance = accountBalance;
    }

    public static String getAccountName() {
        return accountName;
    }

    public static void setAccountName(String accountName) {
        BankAccountStatic.accountName = accountName;
    }

    public static int getAccountNumber() {
        return accountNumber;
    }

    public static void setAccountNumber(int accountNumber) {
        BankAccountStatic.accountNumber = accountNumber;
    }

    //get account information
    public static void getAccountInformation(){
        System.out.println(accountNumber);
        System.out.println(accountName);
        System.out.println(accountBalance);
    }
    //withdraw money
    public static void withdrowMoney(double withdrawAmonut){
        if(withdrawAmonut<accountBalance){
            accountBalance=accountBalance-withdrawAmonut;
            System.out.println(accountBalance);
        }
        else {
            System.out.println("You can not withdraw");
        }
    }
}
