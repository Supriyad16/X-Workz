package com.xworkz.information.external;

import com.xworkz.information.internal.Chair;

public class RockingChair {

    private Chair chair;

    public RockingChair(Chair chair) {
        this.chair = chair;
        System.out.println("Arg constructor of RockingChair");
    }

    public void relax() {
        System.out.println("relax in RockingChair");
        if (this.chair != null) {
            this.chair.sit();
        } else {
            System.out.println("Chair is null");
        }
    }
}
