package com.xworkz.external;

import com.xworkz.rules.Bolt;

public class SteelBolt implements Bolt {

    @Override
    public void tighten() {
        System.out.println("Tightening the steel bolt");
    }

    @Override
    public void loosen() {
        System.out.println("Loosening the steel bolt");
    }

    @Override
    public void rust() {
        System.out.println("Steel bolt getting rusted");
    }

    @Override
    public void stuck(){
        System.out.println("Bolt is Stuck ");
    }

    public static void main(String[] args) {
        SteelBolt steelBolt = new SteelBolt();
        steelBolt.tighten();
        steelBolt.loosen();
        steelBolt.rust();
        steelBolt.stuck();
    }
}
