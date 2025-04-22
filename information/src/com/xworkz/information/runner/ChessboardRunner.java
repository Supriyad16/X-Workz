package com.xworkz.information.runner;

import com.xworkz.information.internal.Chessboard;
import com.xworkz.information.internal.ChessboardImp;
import com.xworkz.information.external.Pawns;

public class ChessboardRunner {

    public static void main(String[] args) {
        Chessboard chessboard = new ChessboardImp();
        Pawns pawns = new Pawns(chessboard);
        pawns.place();
    }
}
