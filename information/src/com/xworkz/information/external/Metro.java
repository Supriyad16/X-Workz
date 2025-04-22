package com.xworkz.information.external;

import com.xworkz.information.internal.Train;

public class Metro {

    private Train train;

    public Metro(Train train) {
        this.train = train;
        System.out.println("Arg constructor of Metro");
    }

    public void schedule() {
        System.out.println("schedule in Metro");
        if (this.train != null) {
            this.train.depart();
        } else {
            System.out.println("Train is null");
        }
    }
}
