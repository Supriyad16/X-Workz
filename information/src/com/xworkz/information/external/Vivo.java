package com.xworkz.information.external;

import com.xworkz.information.internal.Mobile;

public class Vivo {

    private Mobile mobile;

    public Vivo(Mobile mobile) {
        this.mobile = mobile;
        System.out.println("Arg constructor of Vivo");
    }

    public void makeCall() {
        System.out.println("makeCall in Vivo");
        if (this.mobile != null) {
            this.mobile.call();
        } else {
            System.out.println("Mobile is null");
        }
    }
}
