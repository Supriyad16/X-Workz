package com.xworkz.information.runner;

import com.xworkz.information.internal.Internet;
import com.xworkz.information.internal.InternetImp;
import com.xworkz.information.external.Airtel;

public class InternetRunner {

    public static void main(String[] args) {
        Internet internet = new InternetImp();
        Airtel airtel = new Airtel(internet);
        airtel.browse();
    }
}
