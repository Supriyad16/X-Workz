package com.xworkz.vacation.internal;

public class Destination extends PinCode {

    public void home(Address address) {
        address.location();

        if (address instanceof PinCode) {
            System.out.println("Destination is home");

            PinCode pinCode = (PinCode) address;
            pinCode.reach();
            pinCode.displayAddress();
            pinCode.getRegion();
            pinCode.validateAddress();
            pinCode.reach();
            pinCode.location();
        }
    }
}
