package com.xworkz.information.external;

import com.xworkz.information.internal.Racket;

public class Tennis {

    private Racket racket;

    public Tennis(Racket racket) {
        this.racket = racket;
        System.out.println("Arg constructor of Tennis");
    }

    public void startGame() {
        System.out.println("Tennis game started...");
        if (this.racket != null) {
            this.racket.swing();
        } else {
            System.out.println("Racket is null");
        }
    }
}
