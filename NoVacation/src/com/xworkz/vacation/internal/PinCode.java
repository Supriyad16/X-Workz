package com.xworkz.vacation.internal;

public class PinCode extends Address {

    PinCode() {
        super();
        System.out.println("Pincode initialized");
    }

    @Override
    public void displayAddress() {
        System.out.println("Deliver to this PinCode");
    }

    @Override
    public void location() {
        System.out.println("This is a office address.");
    }

    @Override
    public void updateAddress() {
        System.out.println("Address update failed. ");
    }

    @Override
    public void validateAddress() {
        System.out.println("Validating address.");
    }

    @Override
    public void getRegion() {
        System.out.println("Get the Region.");
    }

        public void reach(){
            System.out.println("reach the destination");
        }
    }

