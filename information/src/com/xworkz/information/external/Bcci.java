package com.xworkz.information.external;

import com.xworkz.information.internal.Icc;

public class Bcci {

    Icc icc;

    public Bcci(Icc icc){
        this.icc=icc;
        System.out.println("Arg const of Bcci");
    }

    public void execute(){
        if(this.icc!=null){
            this.icc.fairplay();
        }

        else{
            System.out.println("connector is null");
        }
    }
}
