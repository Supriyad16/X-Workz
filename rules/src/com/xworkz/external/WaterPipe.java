package com.xworkz.external;

import com.xworkz.rules.Pipe;

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

    @Override
    public void connect(){
        System.out.println("Water pipe connects to another pipe");
    }

    public static void main(String[] args) {
        WaterPipe waterPipe = new WaterPipe();
        waterPipe.flow();
        waterPipe.bends();
        waterPipe.cut();
        waterPipe.connect();
    }
}
