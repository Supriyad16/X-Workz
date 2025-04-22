package com.xworkz.information.external;

import com.xworkz.information.internal.Chef;

public class Foodie {

    private Chef chef;

    public Foodie(Chef chef) {
        this.chef = chef;
        System.out.println("Arg constructor of Foodie");
    }

    public void eat() {
        System.out.println("eat in Foodie");
        if (this.chef != null) {
            this.chef.cook();
        } else {
            System.out.println("Chef is null");
        }
    }
}
