package com.xworkz.information.runner;

import com.xworkz.information.internal.Train;
import com.xworkz.information.internal.TrainImp;
import com.xworkz.information.external.Metro;

public class TrainRunner {

    public static void main(String[] args) {
        Train train = new TrainImp();
        Metro metro = new Metro(train);
        metro.schedule();
    }
}
