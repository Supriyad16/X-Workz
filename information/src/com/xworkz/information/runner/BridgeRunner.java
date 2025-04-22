package com.xworkz.information.runner;

import com.xworkz.information.internal.Bridge;
import com.xworkz.information.internal.BridgeImp;
import com.xworkz.information.external.River;

public class BridgeRunner {

    public static void main(String[] args) {
        Bridge bridge = new BridgeImp();
        River river = new River(bridge);
        river.cross();
    }
}
