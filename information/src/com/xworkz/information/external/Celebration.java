package com.xworkz.information.external;

import com.xworkz.information.internal.Festival;

public class Celebration {

    private Festival festival;

    public Celebration(Festival festival) {
        this.festival = festival;
        System.out.println("Arg constructor of Celebration");
    }

    public void start() {
        System.out.println("Starting celebration...");
        if (this.festival != null) {
            this.festival.organize();
        } else {
            System.out.println("Festival is null");
        }
    }
}
