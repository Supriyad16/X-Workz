package com.xworkz.task.today;

public class BluetoothRunner {
    public static void main(String[] args) {
        Bluetooth bluetooth = new Bluetooth("DefaultType", "DefaultBrand", true);
        System.out.println("Bluetooth " + bluetooth.toString());


        int code = bluetooth.hashCode();
        String value="connection";
        System.out.println("Device:" + bluetooth.hashCode());
        System.out.println("Device:" + value.hashCode());
    }
}
