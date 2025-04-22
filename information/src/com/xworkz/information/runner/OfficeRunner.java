package com.xworkz.information.runner;

import com.xworkz.information.internal.Office;
import com.xworkz.information.internal.OfficeImp;
import com.xworkz.information.external.Employee;

public class OfficeRunner {

    public static void main(String[] args) {
        Office office = new OfficeImp();
        Employee emp = new Employee(office);
        emp.startWork();
    }
}
