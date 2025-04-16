package com.xworkz.rules;

public class NotebookPaper implements Paper {

    @Override
    public void write() {
        System.out.println("Writing on the notebook paper");
    }

    @Override
    public void tear() {
        System.out.println("Tearing the notebook paper");
    }

    @Override
    public void fold() {
        System.out.println("Folding the notebook paper");
    }

    public static void main(String[] args) {
        NotebookPaper paper = new NotebookPaper();
        paper.write();
        paper.tear();
        paper.fold();
    }
}
