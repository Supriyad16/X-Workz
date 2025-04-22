package com.xworkz.information.runner;

import com.xworkz.information.internal.Textile;
import com.xworkz.information.internal.TextileImp;
import com.xworkz.information.external.Customer;

public class TextileRunner {

    public static void main(String[] args) {
        Textile textile = new TextileImp();
        Customer customer = new Customer(textile);
        customer.buy();
    }
}
