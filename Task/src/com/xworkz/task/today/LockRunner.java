package com.xworkz.task.today;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new Lock("Padlock", "Iron", false);
        System.out.println("Lock " + lock.toString());

        int code = lock.hashCode();
        String value="room";
        System.out.println("Safer place:" + lock.hashCode());
        System.out.println("Safer place:" + value.hashCode());
    }
}
