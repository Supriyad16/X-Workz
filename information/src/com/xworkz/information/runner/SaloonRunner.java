package com.xworkz.information.runner;

import com.xworkz.information.internal.Saloon;
import com.xworkz.information.internal.SaloonImp;
import com.xworkz.information.external.Parlour;

public class SaloonRunner {

    public static void main(String[] args) {
        Saloon saloon = new SaloonImp();
        Parlour parlour = new Parlour(saloon);
        parlour.style();
    }
}
