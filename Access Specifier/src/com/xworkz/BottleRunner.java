package com.xworkz;

import com.xworkz.internals.Bottle;
import com.xworkz.internals.Material;
import com.xworkz.internals2.Quantity;

public class BottleRunner {

        public static void main(String[] args) {
            Bottle bottle=new Bottle();
            Material material=new Material();
            material.Plastic();

            Quantity quantity=new Quantity();
            quantity.required();
        }

    }
}
