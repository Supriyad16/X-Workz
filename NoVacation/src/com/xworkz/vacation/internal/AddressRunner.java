package com.xworkz.vacation.internal;

public class AddressRunner {

    public static void main(String[] args) {

        Address address = new PinCode();
        address.displayAddress();
        address.updateAddress();
        address.validateAddress();
        address.getRegion();
        address.location();

        System.out.println("----");

        PinCode pinCode = new PinCode();
        pinCode.displayAddress();
        pinCode.updateAddress();
        pinCode.validateAddress();
        pinCode.getRegion();
        pinCode.location();

        System.out.println("----");

        Destination destination = new Destination();
        destination.displayAddress();
        destination.reach();
        destination.updateAddress();
        destination.validateAddress();
        destination.location();
        destination.getRegion();
    }
}