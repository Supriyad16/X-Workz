package com.xworkz.information.external;

import com.xworkz.information.internal.Sweet;

public class Sugar {

    private Sweet sweet;

    public Sugar(Sweet sweet) {
        this.sweet = sweet;
        System.out.println("Arg constructor of Sugar");
    }

    public void serveSweet() {
        System.out.println("serveSweet in Sugar");
        if (this.sweet != null) {
            this.sweet.taste();
        } else {
            System.out.println("Sweet is null");
        }
    }
}
