package com.xworkz.information.external;

import com.xworkz.information.internal.Building;

public class Rooms {

    private Building building;

    public Rooms(Building building) {
        this.building = building;
        System.out.println("Arg constructor of Rooms");
    }

    public void allocate() {
        System.out.println("allocate in Rooms");
        if (this.building != null) {
            this.building.construct();
        } else {
            System.out.println("Building is null");
        }
    }
}
