package com.xworkz.information.external;

import com.xworkz.information.internal.Chessboard;

public class Pawns {

    private Chessboard chessboard;

    public Pawns(Chessboard chessboard) {
        this.chessboard = chessboard;
        System.out.println("Arg constructor of Pawns");
    }

    public void place() {
        System.out.println("place in Pawns");
        if (this.chessboard != null) {
            this.chessboard.layout();
        } else {
            System.out.println("Chessboard is null");
        }
    }
}
