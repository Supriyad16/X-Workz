package com.xworkz.information.runner;

import com.xworkz.information.internal.Festival;
import com.xworkz.information.internal.FestivalImp;
import com.xworkz.information.external.Celebration;

public class FestivalRunner {

    public static void main(String[] args) {
        Festival festival = new FestivalImp();
        Celebration celebration = new Celebration(festival);
        celebration.start();
    }
}
