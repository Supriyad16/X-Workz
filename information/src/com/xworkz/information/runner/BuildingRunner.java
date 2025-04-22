package com.xworkz.information.runner;

import com.xworkz.information.internal.Building;
import com.xworkz.information.internal.BuildingImp;
import com.xworkz.information.external.Rooms;

public class BuildingRunner {

    public static void main(String[] args) {
        Building building = new BuildingImp();
        Rooms rooms = new Rooms(building);
        rooms.allocate();
    }
}
