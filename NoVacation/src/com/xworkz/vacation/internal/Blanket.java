package com.xworkz.vacation.internal;

public class Blanket extends  Pillow{

    public void soft(Bed bed){

        bed.study();

        if(bed instanceof Pillow){

            Pillow pillow = (Pillow) bed;
            pillow.sleep();
            pillow.study();
            pillow.colour();
            pillow.differentMaterials();
            pillow.differentSizes();
            pillow.comfort();
        }
    }


}
