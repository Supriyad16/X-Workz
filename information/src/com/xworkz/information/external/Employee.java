package com.xworkz.information.external;

import com.xworkz.information.internal.Office;

public class Employee {

    private Office office;

    public Employee(Office office) {
        this.office = office;
        System.out.println("Arg constructor of Employee");
    }

    public void startWork() {
        System.out.println("startWork in Employee");
        if (this.office != null) {
            this.office.work();
        } else {
            System.out.println("Office is null");
        }
    }
}
