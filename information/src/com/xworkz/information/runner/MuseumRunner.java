package com.xworkz.information.runner;

import com.xworkz.information.internal.Museum;
import com.xworkz.information.internal.MuseumImp;
import com.xworkz.information.external.ArtGallery;

public class MuseumRunner {

    public static void main(String[] args) {
        Museum museum = new MuseumImp();
        ArtGallery gallery = new ArtGallery(museum);
        gallery.explore();
    }
}
