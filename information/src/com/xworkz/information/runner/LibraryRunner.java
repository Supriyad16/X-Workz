package com.xworkz.information.runner;

import com.xworkz.information.internal.Library;
import com.xworkz.information.internal.LibraryImp;
import com.xworkz.information.external.PublicLibrary;

public class LibraryRunner {

    public static void main(String[] args) {
        Library library = new LibraryImp();
        PublicLibrary publicLibrary = new PublicLibrary(library);
        publicLibrary.manageLibrary();
    }
}
