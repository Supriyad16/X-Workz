package com.xworkz.external;

import com.xworkz.rules.Cup;

public class TeaCup implements Cup {

    @Override
    public void pour() {
        System.out.println("Pouring tea into the teacup");
    }

    @Override
    public void drink() {
        System.out.println("Drinking tea from the teacup");
    }

    @Override
    public void wash() {
        System.out.println("Washing the teacup");
    }

    @Override
    public void material(){
        System.out.println("cup have different materials");
    }

    public static void main(String[] args) {
        TeaCup teaCup = new TeaCup();
        teaCup.pour();
        teaCup.drink();
        teaCup.wash();
        teaCup.material();
    }
}
