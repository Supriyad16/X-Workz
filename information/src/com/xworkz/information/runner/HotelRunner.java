package com.xworkz.information.runner;

import com.xworkz.information.internal.Hotel;
import com.xworkz.information.internal.HotelImp;
import com.xworkz.information.external.Menu;

public class HotelRunner {

    public static void main(String[] args) {
        Hotel hotel = new HotelImp();
        Menu menu = new Menu(hotel);
        menu.showMenu();
    }
}
