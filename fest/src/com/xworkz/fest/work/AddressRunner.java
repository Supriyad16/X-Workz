package com.xworkz.fest.work;

public class AddressRunner {

    public static void main(String[] args) {

        Address address = new PinCode();

        address.displayAddress();
        address.updateAddress();
        address.validateAddress();
        address.getRegion();
        address.locationInfo();

        PinCode pinCode = new PinCode();

        pinCode.getAreaCode();
        pinCode.checkDeliveryAvailability();
        pinCode.displayPincode();
        pinCode.validatePincode();
        pinCode.updateAddress();
    }
}
