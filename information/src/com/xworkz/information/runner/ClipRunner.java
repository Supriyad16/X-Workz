package com.xworkz.information.runner;

import com.xworkz.information.internal.Clip;
import com.xworkz.information.internal.ClipImp;
import com.xworkz.information.external.HairClip;

public class ClipRunner {

    public static void main(String[] args) {
        Clip clip = new ClipImp();
        HairClip hairClip = new HairClip(clip);
        hairClip.useClip();
    }
}
