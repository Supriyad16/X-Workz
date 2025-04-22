package com.xworkz.information.runner;

import com.xworkz.information.internal.Park;
import com.xworkz.information.internal.ParkImp;
import com.xworkz.information.external.CubbonPark;

public class ParkRunner {

    public static void main(String[] args) {
        Park park = new ParkImp();
        CubbonPark cubbon = new CubbonPark(park);
        cubbon.visit();
    }
}
