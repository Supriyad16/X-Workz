package com.xworkz.information.runner;

import com.xworkz.information.external.Bcci;
import com.xworkz.information.internal.Icc;
import com.xworkz.information.internal.IndianCricketTeamIccImpl;

public class IccRunner {

    public static void main(String[] args) {

        Icc icc = new IndianCricketTeamIccImpl();

        Bcci bcci = new Bcci(icc);
        bcci.execute();
    }
}
