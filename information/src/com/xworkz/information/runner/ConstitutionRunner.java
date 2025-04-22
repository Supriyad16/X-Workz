package com.xworkz.information.runner;

import com.xworkz.information.external.Government;
import com.xworkz.information.internal.CitizenConstituionImpl;
import com.xworkz.information.internal.Constitution;

public class ConstitutionRunner {

    public static void main(String[] args) {

        Constitution constitution= new CitizenConstituionImpl();

        Government government = new Government(constitution);
        government.rule();
    }
}
