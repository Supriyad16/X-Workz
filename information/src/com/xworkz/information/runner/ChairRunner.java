package com.xworkz.information.runner;

import com.xworkz.information.internal.Chair;
import com.xworkz.information.internal.ChairImp;
import com.xworkz.information.external.RockingChair;

public class ChairRunner {

    public static void main(String[] args) {
        Chair chair = new ChairImp();
        RockingChair rockingChair = new RockingChair(chair);
        rockingChair.relax();
    }
}
