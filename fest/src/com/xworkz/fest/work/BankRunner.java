package com.xworkz.fest.work;

public class BankRunner {


    public static void main(String[] args) {

        Bank bank = new SavingsAccount();
        bank.openAccount();
        bank.depositMoney();
        bank.withdrawMoney();
        bank.provideLoan();
        bank.generateStatement();



        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.earnInterest();
        savingsAccount.maintainMinimumBalance();
        savingsAccount.withdrawLimit();
        savingsAccount.onlineBanking();
        savingsAccount.issueDebitCard();
    }

}

