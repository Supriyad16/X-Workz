package com.xworkz.vacation.internal;

public class Loan extends SavingsAccount{

    public void homeLoan(Bank bank){

        bank.openAccount();

        if(bank instanceof SavingsAccount){

            SavingsAccount savingsAccount = (SavingsAccount) bank;
            savingsAccount.generateStatement();
            savingsAccount.depositMoney();
            savingsAccount.provideLoan();
            savingsAccount.interest();
            savingsAccount.openAccount();
            savingsAccount.withdrawMoney();
        }

    }
}
