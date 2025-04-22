package com.xworkz.information.runner;

import com.xworkz.information.internal.Garden;
import com.xworkz.information.internal.GardenImp;
import com.xworkz.information.external.Botanist;

public class GardenRunner {

    public static void main(String[] args) {
        Garden garden = new GardenImp();
        Botanist botanist = new Botanist(garden);
        botanist.examine();
    }
}
