package com.xworkz.external;

import com.xworkz.rules.Paper;

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

    @Override
    public void craft(){
        System.out.println("Crafts using colour paper");
    }

    public static void main(String[] args) {
        NotebookPaper notebookPaper = new NotebookPaper();
        notebookPaper.write();
        notebookPaper.tear();
        notebookPaper.fold();
        notebookPaper.craft();
    }
}
