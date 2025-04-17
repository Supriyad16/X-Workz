package com.xworkz.external;

import com.xworkz.rules.Phone;

public class SmartPhone implements Phone {

    @Override
    public void call() {
        System.out.println("Making a call on the smartphone");
    }

    @Override
    public void text() {
        System.out.println("Sending a text from the smartphone");
    }

    @Override
    public void browse() {
        System.out.println("Browsing the web on the smartphone");
    }

    @Override
    public void scroll(){
        System.out.println("Scroll through social media in smart phone");
    }


    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.call();
        smartPhone.text();
        smartPhone.browse();
        smartPhone.scroll();
    }
}
