package com.xworkz.information.runner;

import com.xworkz.information.internal.Farmer;
import com.xworkz.information.internal.FarmerImp;
import com.xworkz.information.external.Retailers;

public class FarmerRunner {

    public static void main(String[] args) {
        Farmer farmer = new FarmerImp();
        Retailers retailers = new Retailers(farmer);
        retailers.supply();
    }
}
