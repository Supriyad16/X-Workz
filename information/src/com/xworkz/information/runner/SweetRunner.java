package com.xworkz.information.runner;

import com.xworkz.information.internal.Sweet;
import com.xworkz.information.internal.SweetImp;
import com.xworkz.information.external.Sugar;

public class SweetRunner {

    public static void main(String[] args) {
        Sweet sweet = new SweetImp();
        Sugar sugar = new Sugar(sweet);
        sugar.serveSweet();
    }
}
