package com.xworkz.rules;

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

    public static void main(String[] args) {
        NotePad pad = new NotePad();
        pad.write();
        pad.tear();
        pad.bind();
    }
}
