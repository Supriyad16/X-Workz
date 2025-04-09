package com.xworkz.task.today;

public class BluetoothRunner {
    public static void main(String[] args) {
        Bluetooth bluetooth = new Bluetooth("DefaultType", "DefaultBrand", true);
        System.out.println("Bluetooth " + bluetooth.toString());
    }
}
