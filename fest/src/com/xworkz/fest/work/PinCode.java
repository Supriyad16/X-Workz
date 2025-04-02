package com.xworkz.fest.work;

public class PinCode extends Address {



    PinCode() {
        super();
        System.out.println("Pincode initialized");
    }

    public void displayPincode() {

        System.out.println(" Display Pincode: "  );
    }

    public void validatePincode() {

        System.out.println("Checking if pincode is correct...");
    }

    public void updatePincode() {

        System.out.println("Pincode updated successfully");
    }

    public void checkDeliveryAvailability() {

        System.out.println("Checking if delivery is available for pincode " );
    }

    public void getAreaCode() {

        System.out.println("Retrieving area code for pincode: " );
    }
}
