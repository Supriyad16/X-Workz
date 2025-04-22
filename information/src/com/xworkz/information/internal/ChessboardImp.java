package com.xworkz.information.internal;

public class ChessboardImp implements Chessboard {

    public ChessboardImp() {
        System.out.println("No-arg constructor of ChessboardImp");
    }

    @Override
    public void layout() {
        System.out.println("Running layout in ChessboardImp");
    }
}
