package com.xworkz.information.runner;

import com.xworkz.information.internal.Cab;
import com.xworkz.information.internal.CabImp;
import com.xworkz.information.external.Ola;

public class CabRunner {

    public static void main(String[] args) {
        Cab cab = new CabImp();
        Ola ola = new Ola(cab);
        ola.requestRide();
    }
}
