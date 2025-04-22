package com.xworkz.information.external;

import com.xworkz.information.internal.Bridge;

public class River {

    private Bridge bridge;

    public River(Bridge bridge) {
        this.bridge = bridge;
        System.out.println("Arg constructor of River");
    }

    public void cross() {
        System.out.println("Crossing the river...");
        if (this.bridge != null) {
            this.bridge.build();
        } else {
            System.out.println("Bridge is null");
        }
    }
}
