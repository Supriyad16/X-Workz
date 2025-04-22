package com.xworkz.information.runner;

import com.xworkz.information.internal.Screw;
import com.xworkz.information.internal.ScrewImp;
import com.xworkz.information.external.Nuts;

public class ScrewRunner {

    public static void main(String[] args) {
        Screw screw = new ScrewImp();
        Nuts nuts = new Nuts(screw);
        nuts.fit();
    }
}
