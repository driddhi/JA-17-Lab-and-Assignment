package com.capgemini.lab4;

public class Book  extends WrittemItem {
    Book (int id, String title, int nC, String author) {
        super(id, title, nC, author);
    }

//    Getters
    public int getIdentificationNumber() { return super.getIdentificationNumber(); }
    public String getTitle() { return super.getTitle(); }
    public int getNumberOfCopies() { return super.getNumberOfCopies(); }

//    Methods
    public void print() {
        System.out.println("Display information about book:");
        super.print();
        System.out.println("Author of the book: " + super.getAuthor());
    }
    public void checkIn() { super.checkIn(); }
    public void checkOut() { super.checkOut(); }
    public void addItems() { super.addItems(); }
}


