package com.xworkz.task.today;

public class CashewRunner {
    public static void main(String[] args) {
        Cashew cashew = new Cashew("Premium", 100, false);
        System.out.println("Cashew " + cashew.toString());
        System.out.println("Cashew " + cashew.hashCode());

        int code = cashew.hashCode();
        String value="dryfruits";
        System.out.println("Healthy:" + cashew.hashCode());
        System.out.println("Healthy:" + value.hashCode());
    }
}