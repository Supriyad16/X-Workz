package com.xworkz.information.external;

import com.xworkz.information.internal.Cab;

public class Ola {

    private Cab cab;

    public Ola(Cab cab) {
        this.cab = cab;
        System.out.println("Arg constructor of Ola");
    }

    public void requestRide() {
        System.out.println("requestRide in Ola");
        if (this.cab != null) {
            this.cab.book();
        } else {
            System.out.println("Cab is null");
        }
    }
}
