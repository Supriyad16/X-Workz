package com.xworkz.task.today;

public class ChargerRunner {

    public static void main(String[] args) {
        Charger charger = new Charger("Samsung", 25, true);
        System.out.println("Charger " + charger.toString());

        int code = charger.hashCode();
        String value="device";
        System.out.println("Charges:" + charger.hashCode());
        System.out.println("Charges:" + value.hashCode());
    }
}
