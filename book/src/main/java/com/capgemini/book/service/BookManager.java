package com.capgemini.book.service;

//import com.capgemini.book.model.*;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Collection;
//import java.util.Map;
import java.util.Scanner;
//import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.book.exception.ArrayListIsNullException;
import com.capgemini.book.exception.BookAlreadyFoundException;
import com.capgemini.book.exception.BookIDCannotBeNegativeException;
import com.capgemini.book.exception.BookNameCannotBeNullException;
import com.capgemini.book.exception.BookNotFoundException;
import com.capgemini.book.exception.PriceIsNotValidException;
import com.capgemini.book.model.Book;

//import com.capgemini.ContactManagerAppUsingCollection.Contact;

public class BookManager {

	Scanner sc = new Scanner(System.in);

	ArrayList<Book> bookList = new ArrayList<Book>();

	public ArrayList<Book> createBookList(int bid, String name, double price) {
		Book book = new Book(bid, name, price);
		validateBook(book);
		try {
			checkIfBookAlreadyExist(book);
		} catch (BookAlreadyFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		bookList.add(book);
		return bookList;

	}

	public void read(ArrayList<Book> bookList) throws ArrayListIsNullException  {
		if(bookList.isEmpty()) {
			throw new ArrayListIsNullException("ArrayList can not be null!");}
		
			Iterator<Book> iterator=bookList.iterator();
			while(iterator.hasNext())
			{
				Book b=iterator.next();
				System.out.println("Book id:"+b.getBid()+"book name:"+b.getBname()+"book price:"+b.getPrice());
					
			}
			
		}
		// TODO Auto-generated method stub

	

	public void update(int bid, String bname, double price) throws BookNotFoundException {
		Book book = new Book(bid, bname, price);
		boolean flag = false;
		for (Book i : bookList) {
			if (i.getBid() == bid) {
				validateBook(book);
				try {
					checkIfBookAlreadyExist(book);
				} catch (BookAlreadyFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i.setBname(bname);
				i.setPrice(price);
				flag = true;
			}

			if (flag == false) {
				throw new BookNotFoundException("Book not found!");

			}
		}
		// TODO Auto-generated method stub

	}

	public void delete(ArrayList<Book> bookList,int bid) throws BookNotFoundException {
		boolean flag = false;
		System.out.println("Enter the book id of the book to be deleted!");
		int id = sc.nextInt();
		for (Book i : bookList) {
			if (i.getBid() == id) {
				i = null;
				flag = true;
			}
		}
		if (!flag) {
			throw new BookNotFoundException("Book not found!");
		}

	}

	private void checkIfBookAlreadyExist(Book book) throws BookAlreadyFoundException {
		for(Book i:bookList) {
			if(book.getBname().equalsIgnoreCase(i.getBname())&& book.getBid()==i.getBid()) {
				throw new BookAlreadyFoundException();
			}
			}
		}

	private void validateBook(Book book) {
		// TODO Auto-generated method stub

		try {
			book.validateBid();
		} catch (BookIDCannotBeNegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book.validateBname();
		} catch (BookNameCannotBeNullException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			book.validatePrice();
		} catch (PriceIsNotValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
