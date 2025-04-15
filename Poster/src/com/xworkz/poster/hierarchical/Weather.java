package com.xworkz.poster.hierarchical;

public class Weather extends Satellite {
    void collectData() {
        System.out.println("Collecting weather data");
    }

    public static void main(String[] args) {
        Weather ws = new Weather();
        ws.orbit();
        ws.collectData();
    }
}
