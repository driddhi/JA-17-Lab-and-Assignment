package com.capgemini.book;
import java.util.ArrayList;
import java.util.Scanner;

import com.capgemini.book.exception.ArrayListIsNullException;
import com.capgemini.book.exception.BookNotFoundException;
import com.capgemini.book.model.Book;
import com.capgemini.book.service.BookManager;


public class BookMain {
	
		static Scanner sc=new Scanner(System.in);
		static ArrayList<Book> bookList = new ArrayList<Book>();

		static int bid;
		static String bname;
		static double price;
		public static void main(String[] args) {
			BookManager bm=new BookManager();
			char choice='y';
			 
			
			do
			{
			System.out.println("enter the choice");
			System.out.println("c:for creating the booklist");
			System.out.println("r:for reading list of books");
			System.out.println("u:for updating the book ");
			System.out.println("d:delete the book ");
			char ch=sc.next().trim().charAt(0);
			
			
			
			switch(ch) {
			case 'c':
				readDetails();
				bookList=bm.createBookList(bid, bname,price);
				break;
				
			case 'r':
				try {
					bm.read(bookList);
				} catch (ArrayListIsNullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
					
			case 'u':
				readDetails();
				try {
					bm.update(bid,bname,price);
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 'd':
				
				try {
					bm.delete(bookList, bid);
				} catch (BookNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
				default:
					
					break;
			}//switch close
			
			System.out.println("do you want to continue?");
			choice=sc.next().trim().charAt(0);
			}while(choice=='y');//close while
			
		}
		
		public static void readDetails() {
			System.out.println("Enter the book details");
			System.out.println("enter the bid:");
			bid=sc.nextInt();
			System.out.println("enter the name:");
			bname=sc.next();
			System.out.println("enter the price");
			price=sc.nextDouble();
		}

	


}
