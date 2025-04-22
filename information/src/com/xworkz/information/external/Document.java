package com.xworkz.information.external;

import com.xworkz.information.internal.Printer;

public class Document {

    private Printer printer;

    public Document(Printer printer) {
        this.printer = printer;
        System.out.println("Arg constructor of Document");
    }

    public void sendToPrint() {
        System.out.println("Sending to print...");
        if (this.printer != null) {
            this.printer.print();
        } else {
            System.out.println("Printer is null");
        }
    }
}
