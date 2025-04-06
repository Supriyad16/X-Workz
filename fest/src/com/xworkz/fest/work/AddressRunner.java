package com.xworkz.fest.work;

public class AddressRunner {

    public static void main(String[] args) {

        Address address = new PinCode();
        address.displayAddress();
        address.updateAddress();
        address.validateAddress();
        address.getRegion();
        address.location();

        PinCode pinCode = new PinCode();
        pinCode.displayAddress();
        pinCode.updateAddress();
        pinCode.validateAddress();
        pinCode.getRegion();
        pinCode.location();
    }
}
