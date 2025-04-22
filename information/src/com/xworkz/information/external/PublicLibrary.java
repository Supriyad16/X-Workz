package com.xworkz.information.external;

import com.xworkz.information.internal.Library;

public class PublicLibrary {

    private Library library;

    public PublicLibrary(Library library) {
        this.library = library;
        System.out.println("Arg constructor of PublicLibrary");
    }

    public void manageLibrary() {
        System.out.println("manageLibrary in PublicLibrary");
        if (this.library != null) {
            this.library.open();
        } else {
            System.out.println("Library is null");
        }
    }
}
