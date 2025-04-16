package com.xworkz.rules;

public class WaterPipe implements Pipe {

    @Override
    public void flow() {
        System.out.println("Water is flowing through the pipe");
    }

    @Override
    public void bends() {
        System.out.println("Bending the water pipe");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the water pipe");
    }

    public static void main(String[] args) {
        WaterPipe pipe = new WaterPipe();
        pipe.flow();
        pipe.bends();
        pipe.cut();
    }
}
