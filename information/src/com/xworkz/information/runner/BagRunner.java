package com.xworkz.information.runner;

import com.xworkz.information.external.HandBag;
import com.xworkz.information.internal.Bag;
import com.xworkz.information.internal.BagImp;

public class BagRunner {

    public static void main(String[] args) {

        Bag bag = new BagImp();

        HandBag handBag = new HandBag(bag);
        handBag.carryItems();
    }
}
