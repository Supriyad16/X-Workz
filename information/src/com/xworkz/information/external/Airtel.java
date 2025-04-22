package com.xworkz.information.external;

import com.xworkz.information.internal.Internet;

public class Airtel {

    private Internet internet;

    public Airtel(Internet internet) {
        this.internet = internet;
        System.out.println("Arg constructor of Airtel");
    }

    public void browse() {
        System.out.println("browse in Airtel");
        if (this.internet != null) {
            this.internet.connect();
        } else {
            System.out.println("Internet is null");
        }
    }
}
