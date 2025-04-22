package com.xworkz.information.external;

import com.xworkz.information.internal.Hotel;

public class Menu {

    private Hotel hotel;

    public Menu(Hotel hotel) {
        this.hotel = hotel;
        System.out.println("Arg constructor of Menu");
    }

    public void showMenu() {
        System.out.println("showMenu in Menu");
        if (this.hotel != null) {
            this.hotel.serve();
        } else {
            System.out.println("Hotel is null");
        }
    }
}
