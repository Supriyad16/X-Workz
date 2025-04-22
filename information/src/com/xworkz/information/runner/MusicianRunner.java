package com.xworkz.information.runner;

import com.xworkz.information.internal.Musician;
import com.xworkz.information.internal.MusicianImp;
import com.xworkz.information.external.Concert;

public class MusicianRunner {

    public static void main(String[] args) {
        Musician musician = new MusicianImp();
        Concert concert = new Concert(musician);
        concert.beginShow();
    }
}
