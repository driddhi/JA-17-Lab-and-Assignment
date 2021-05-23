package com.capgemini.lab4;

public class JournalPaper extends WrittemItem {
    private int publicationYear;
    JournalPaper(int id, String title, int nC, String author, int publicationYear) {
        super(id, title, nC, author);
        this.publicationYear = publicationYear;
    }

//    To String methods
    public String toString() { return super.toString() + publicationYear; }

//    Getters
    public int getYear() { return publicationYear; }
    public int getIdentificationYear() { return super.getIdentificationNumber(); }
}
