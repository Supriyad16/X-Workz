package com.xworkz.task.today;

public class SyrupRunner {

    public static void main(String[] args) {
        Syrup syrup = new Syrup("Cof-X", "Mint", 100);
        System.out.println("Syrup " + syrup.toString());

        int code = syrup.hashCode();
        String value="medicine";
        System.out.println("Measurement:" + syrup.hashCode());
        System.out.println("Measurement:" + value.hashCode());
    }
}
