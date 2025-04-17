package com.xworkz.external;

import com.xworkz.rules.Can;

public class OilCan implements Can {

    @Override
    public void pour() {
        System.out.println("Pouring oil from the can");
    }

    @Override
    public void openLid() {
        System.out.println("Opening the lid of the oil can");
    }

    @Override
    public void refill() {
        System.out.println("Refilling the oil can");
    }

    @Override
    public void spill(){
        System.out.println("Oil is spilled from can");
    }

    public static void main(String[] args) {
        OilCan oilCan = new OilCan();
        oilCan.pour();
        oilCan.openLid();
        oilCan.refill();
        oilCan.spill();
    }
}
