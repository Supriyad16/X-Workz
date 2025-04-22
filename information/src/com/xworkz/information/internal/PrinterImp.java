package com.xworkz.information.internal;

public class PrinterImp implements Printer {

    public PrinterImp() {
        System.out.println("No-arg constructor of PrinterImp");
    }

    @Override
    public void print() {
        System.out.println("Printing document in PrinterImp");
    }
}
