package com.xworkz.rules;

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

    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.text();
        phone.browse();
    }
}
