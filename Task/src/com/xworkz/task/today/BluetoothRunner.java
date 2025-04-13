package com.xworkz.task.today;

public class BluetoothRunner {
    public static void main(String[] args) {
        Bluetooth bluetooth = new Bluetooth("Wired", "OnePlus", true);
        System.out.println("Bluetooth " + bluetooth.toString());


        int code = bluetooth.hashCode();
        String value="connection";
        System.out.println("Device:" + bluetooth.hashCode());
        System.out.println("Device:" + value.hashCode());

        Bluetooth bluetooth1 = new Bluetooth("WireLess", "Boat", false);
        boolean equal= bluetooth1.equals(bluetooth1);
        System.out.println("equal :"+ equal);
    }
}
