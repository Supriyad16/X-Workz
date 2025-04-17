package com.xworkz.external;

import com.xworkz.rules.Pad;

public class NotePad implements Pad {

    @Override
    public void write() {
        System.out.println("Writing notes in the notepad");
    }

    @Override
    public void tear() {
        System.out.println("Tearing a page from the notepad");
    }

    @Override
    public void bind() {
        System.out.println("Binding the notepad");
    }

    @Override
    public void support(){
        System.out.println("write on notepad ");
    }

    public static void main(String[] args) {
        NotePad notePad = new NotePad();
        notePad.write();
        notePad.tear();
        notePad.bind();
        notePad.support();
    }
}
