package com.xworkz.information.external;

import com.xworkz.information.internal.Museum;

public class ArtGallery {

    private Museum museum;

    public ArtGallery(Museum museum) {
        this.museum = museum;
        System.out.println("Arg constructor of ArtGallery");
    }

    public void explore() {
        System.out.println("explore in ArtGallery");
        if (this.museum != null) {
            this.museum.exhibit();
        } else {
            System.out.println("Museum is null");
        }
    }
}
