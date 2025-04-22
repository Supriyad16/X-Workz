package com.xworkz.information.external;

import com.xworkz.information.internal.Theater;

public class Movies {

    private Theater theater;

    public Movies(Theater theater) {
        this.theater = theater;
        System.out.println("Arg constructor of Movies");
    }

    public void show() {
        System.out.println("show in Movies");
        if (this.theater != null) {
            this.theater.play();
        } else {
            System.out.println("Theater is null");
        }
    }
}
