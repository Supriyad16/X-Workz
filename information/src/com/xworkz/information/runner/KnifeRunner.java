package com.xworkz.information.runner;

import com.xworkz.information.internal.Knife;
import com.xworkz.information.internal.KnifeImp;
import com.xworkz.information.external.Chop;

public class KnifeRunner {

    public static void main(String[] args) {
        Knife knife = new KnifeImp();
        Chop chop = new Chop(knife);
        chop.chopVegetables();
    }
}
