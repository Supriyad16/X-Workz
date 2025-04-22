package com.xworkz.information.external;

import com.xworkz.information.internal.Traffic;

public class TrafficRules {

    private Traffic traffic;

    public TrafficRules(Traffic traffic) {
        this.traffic = traffic;
        System.out.println("Arg constructor of TrafficRules");
    }

    public void enforce() {
        System.out.println("enforce in TrafficRules");
        if (this.traffic != null) {
            this.traffic.follow();
        } else {
            System.out.println("Traffic is null");
        }
    }
}
