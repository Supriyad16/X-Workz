package com.xworkz.vacation.internal;

public class SavingsAccount extends Bank {

    SavingsAccount() {
        super();
        System.out.println("Savings Account class");
    }

    @Override
    public void openAccount() {
        System.out.println("Opens an account");
    }

    @Override
    public void depositMoney() {
        System.out.println("Deposit Money.");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Withdrawals Money");
    }

    @Override
    public void provideLoan() {
        System.out.println("Bank gives loans");
    }

    @Override
    public void generateStatement() {
        System.out.println("Bank generates account statements.");
    }

    public void interest() {
        System.out.println("Bank generates  interest.");
    }
}
