package com.xworkz.information.external;

import com.xworkz.information.internal.Textile;

public class Customer {

    private Textile textile;

    public Customer(Textile textile) {
        this.textile = textile;
        System.out.println("Arg constructor of Customer");
    }

    public void buy() {
        System.out.println("buy in Customer");
        if (this.textile != null) {
            this.textile.produce();
        } else {
            System.out.println("Textile is null");
        }
    }
}
