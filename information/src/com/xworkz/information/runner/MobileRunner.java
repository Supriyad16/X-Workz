package com.xworkz.information.runner;

import com.xworkz.information.internal.Mobile;
import com.xworkz.information.internal.MobileImp;
import com.xworkz.information.external.Vivo;

public class MobileRunner {

    public static void main(String[] args) {
        Mobile mobile = new MobileImp();
        Vivo vivo = new Vivo(mobile);
        vivo.makeCall();
    }
}
