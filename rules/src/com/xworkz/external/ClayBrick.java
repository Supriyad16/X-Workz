package com.xworkz.external;

import com.xworkz.rules.Brick;

public class ClayBrick implements Brick {

    @Override
    public void build() {
        System.out.println("Building with clay brick");
    }

    @Override
    public void breakBrick() {
        System.out.println("Breaking the clay brick");
    }

    @Override
    public void weigh() {
        System.out.println("Weighing the clay brick");
    }

    @Override
    public void strength(){
        System.out.println("Clay brick is so strong");
    }

    public static void main(String[] args) {
        ClayBrick clayBrick = new ClayBrick();
        clayBrick.build();
        clayBrick.breakBrick();
        clayBrick.weigh();
        clayBrick.strength();
    }
}
