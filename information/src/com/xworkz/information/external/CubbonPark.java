package com.xworkz.information.external;

import com.xworkz.information.internal.Park;

public class CubbonPark {

    private Park park;

    public CubbonPark(Park park) {
        this.park = park;
        System.out.println("Arg constructor of CubbonPark");
    }

    public void visit() {
        System.out.println("visit in CubbonPark");
        if (this.park != null) {
            this.park.enjoy();
        } else {
            System.out.println("Park is null");
        }
    }
}
