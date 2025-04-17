package com.xworkz.external;

import com.xworkz.rules.Nail;

public class IronNail implements Nail {

    @Override
    public void hammer() {
        System.out.println("Hammering the iron nail");
    }

    @Override
    public void pull() {
        System.out.println("Pulling out the iron nail");
    }

    @Override
    public void rust() {
        System.out.println("Iron nail rusting over time");
    }

    @Override
    public void hit(){
        System.out.println("hit the nail");
    }

    public static void main(String[] args) {
        IronNail ironNail = new IronNail();
        ironNail.hammer();
        ironNail.pull();
        ironNail.rust();
        ironNail.hit();
    }
}
