package com.xworkz.happy;

class Message {

    static String message;


    static {
        message = "Successfully executed";
        System.out.println("Static block executed: " + message);
    }


    void showMessage() {
        System.out.println("Message: " + message);
    }
}

