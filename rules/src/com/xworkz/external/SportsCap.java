package com.xworkz.external;

import com.xworkz.rules.Cap;

public class SportsCap implements Cap {

    @Override
    public void wear() {
        System.out.println("Wearing the sports cap");
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting the sports cap");
    }

    @Override
    public void remove() {
        System.out.println("Removing the sports cap");
    }

    @Override
    public void close(){
        System.out.println("Close cap");
    }

    public static void main(String[] args) {
        SportsCap sportsCap = new SportsCap();
        sportsCap.wear();
        sportsCap.adjust();
        sportsCap.remove();
        sportsCap.close();
    }
}
