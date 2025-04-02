package com.xworkz.fest.work;

public class SavingsAccount extends Bank {

        SavingsAccount() {
        super();
        System.out.println("Savings Account class");
    }

    public void earnInterest() {
        System.out.println("Savings account earns interest");
    }

    public void maintainMinimumBalance() {
        System.out.println("Savings account requires minimum balance");
    }

    public void withdrawLimit() {
        System.out.println("Savings account has a withdrawal limit");
    }

    public void onlineBanking() {
        System.out.println("Savings account supports online banking");
    }

    public void issueDebitCard() {
        System.out.println("Savings account provides a debit card");
    }
}


