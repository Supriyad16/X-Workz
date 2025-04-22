package com.xworkz.information.external;

import com.xworkz.information.internal.Clip;

public class HairClip {

    private Clip clip;

    public HairClip(Clip clip) {
        this.clip = clip;
        System.out.println("Arg constructor of HairClip");
    }

    public void useClip() {
        System.out.println("useClip in HairClip");
        if (this.clip != null) {
            this.clip.hold();
        } else {
            System.out.println("Clip is null");
        }
    }
}
