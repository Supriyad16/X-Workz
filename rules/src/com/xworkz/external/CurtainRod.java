package com.xworkz.external;

import com.xworkz.rules.Rod;

public class CurtainRod implements Rod {

    @Override
    public void hold() {
        System.out.println("Holding the curtains on the rod");
    }

    @Override
    public void bend() {
        System.out.println("Bending the curtain rod");
    }

    @Override
    public void extend() {
        System.out.println("Extending the curtain rod");
    }

    @Override
    public void support(){
        System.out.println("Give support");
    }

    public static void main(String[] args) {
        CurtainRod curtainRod = new CurtainRod();
        curtainRod.hold();
        curtainRod.bend();
        curtainRod.extend();
        curtainRod.support();
    }
}
