package com.xworkz.information.external;

import com.xworkz.information.internal.Coffee;

public class Beverages {

    private Coffee coffee;

    public Beverages(Coffee coffee) {
        this.coffee = coffee;
        System.out.println("Arg constructor of Beverages");
    }

    public void drink() {
        System.out.println("drink in Beverages");
        if (this.coffee != null) {
            this.coffee.brew();
        } else {
            System.out.println("Coffee is null");
        }
    }
}
