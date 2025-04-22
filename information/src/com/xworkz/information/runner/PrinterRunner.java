package com.xworkz.information.runner;

import com.xworkz.information.internal.Printer;
import com.xworkz.information.internal.PrinterImp;
import com.xworkz.information.external.Document;

public class PrinterRunner {

    public static void main(String[] args) {
        Printer printer = new PrinterImp();
        Document document = new Document(printer);
        document.sendToPrint();
    }
}
