package com.xworkz.information.runner;

import com.xworkz.information.external.OperatingSystem;
import com.xworkz.information.internal.Laptop;
import com.xworkz.information.internal.LaptopImp;

public class LaptopRunner {
    public static void main(String[] args) {

        Laptop laptop = new LaptopImp();

        OperatingSystem operatingSystem = new OperatingSystem(laptop);

        operatingSystem.work();
    }
}
