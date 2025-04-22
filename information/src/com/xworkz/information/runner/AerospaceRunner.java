package com.xworkz.information.runner;

import com.xworkz.information.internal.Aerospace;
import com.xworkz.information.internal.AerospaceImp;
import com.xworkz.information.external.Rocket;

public class AerospaceRunner {

    public static void main(String[] args) {
        Aerospace aerospace = new AerospaceImp();
        Rocket rocket = new Rocket(aerospace);
        rocket.ignite();
    }
}
