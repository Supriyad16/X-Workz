package com.xworkz.information.runner;

import com.xworkz.information.internal.Light;
import com.xworkz.information.internal.LightImp;
import com.xworkz.information.external.Decoration;

public class LightRunner {

    public static void main(String[] args) {
        Light light = new LightImp();
        Decoration decoration = new Decoration(light);
        decoration.enterRoom();
    }
}
