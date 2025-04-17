package com.xworkz.external;

import com.xworkz.rules.Stick;

public class WalkingStick implements Stick {

    @Override
    public void hold() {
        System.out.println("Holding the walking stick");
    }

    @Override
    public void hit() {
        System.out.println("Using the walking stick to hit");
    }

    @Override
    public void breakStick() {
        System.out.println("The walking stick broke");
    }

    @Override
    public void join(){
        System.out.println("join walking stick");
    }

    public static void main(String[] args) {
        WalkingStick walkingStick = new WalkingStick();
        walkingStick.hold();
        walkingStick.hit();
        walkingStick.breakStick();
        walkingStick.join();
    }
}
