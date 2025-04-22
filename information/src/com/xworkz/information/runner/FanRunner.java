package com.xworkz.information.runner;

import com.xworkz.information.internal.Fan;
import com.xworkz.information.internal.FanImp;
import com.xworkz.information.external.Hall;

public class FanRunner {

    public static void main(String[] args) {
        Fan fan = new FanImp();
        Hall hall = new Hall(fan);
        hall.coolRoom();
    }
}
