package com.xworkz.task.today;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new Lock("Padlock", "Iron", false);
        System.out.println("Lock " + lock.toString());
    }
}
