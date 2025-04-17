package com.xworkz.external;

import com.xworkz.rules.Pole;

public class ElectricPole implements Pole {

    @Override
    public void stand() {
        System.out.println("The electric pole is standing");
    }

    @Override
    public void support() {
        System.out.println("The electric pole supports power lines");
    }

    @Override
    public void climb() {
        System.out.println("Climbing the electric pole");
    }

    @Override
    public void connects(){
        System.out.println("one pole connects to another");
    }

    public static void main(String[] args) {
        ElectricPole electricPole = new ElectricPole();
        electricPole.stand();
        electricPole.support();
        electricPole.climb();
        electricPole.connects();
    }
}
