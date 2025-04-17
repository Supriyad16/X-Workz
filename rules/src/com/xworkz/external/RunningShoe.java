package com.xworkz.external;

import com.xworkz.rules.Shoe;

public class RunningShoe implements Shoe {

    @Override
    public void wear() {
        System.out.println("Wearing the running shoes");
    }

    @Override
    public void clean() {
        System.out.println("Cleaning the running shoes");
    }

    @Override
    public void tie() {
        System.out.println("Tying the running shoes");
    }

    @Override
    public void run(){
        System.out.println("sports shoe");
    }

    public static void main(String[] args) {
        RunningShoe runningShoe = new RunningShoe();
        runningShoe.wear();
        runningShoe.clean();
        runningShoe.tie();
        runningShoe.run();
    }
}
