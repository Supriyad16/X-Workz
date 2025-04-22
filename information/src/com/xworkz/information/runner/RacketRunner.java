package com.xworkz.information.runner;

import com.xworkz.information.internal.Racket;
import com.xworkz.information.internal.RacketImp;
import com.xworkz.information.external.Tennis;

public class RacketRunner {

    public static void main(String[] args) {
        Racket racket = new RacketImp();
        Tennis tennis = new Tennis(racket);
        tennis.startGame();
    }
}
