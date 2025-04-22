package com.xworkz.information.runner;

import com.xworkz.information.internal.Traffic;
import com.xworkz.information.internal.TrafficImp;
import com.xworkz.information.external.TrafficRules;

public class TrafficRunner {

    public static void main(String[] args) {
        Traffic traffic = new TrafficImp();
        TrafficRules rules = new TrafficRules(traffic);
        rules.enforce();
    }
}
