package com.xworkz.information.external;

import com.xworkz.information.internal.Fan;

public class Hall {

    private Fan fan;

    public Hall(Fan fan) {
        this.fan = fan;
        System.out.println("Arg constructor of Hall");
    }

    public void coolRoom() {
        System.out.println("Cooling the hall...");
        if (this.fan != null) {
            this.fan.rotate();
        } else {
            System.out.println("Fan is null");
        }
    }
}
