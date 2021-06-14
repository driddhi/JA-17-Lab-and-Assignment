package com.capgemini.ContactManagerAppUsingCollection;

import java.util.Scanner;

import com.capgemini.service.ContactManager;

public class ContactMain {
	static Scanner ip=new Scanner(System.in);
	
	static String fname;
	static String lname;
	static String phNo;
	public static void main(String[] args) {
		ContactManager cm=new ContactManager();
		
		System.out.println("enter the choice");
		System.out.println("a:");
		System.out.println("g:");
		
		char ch=ip.next().trim().charAt(0);
		
		
		char choice='y';
		while(choice=='y') {
		
		switch(ch) {
		case 'a':
			readDetails();
			cm.addContact(fname,lname,phNo);
			break;
			
		case 'g':
			cm.getAllContacts();
			
			break;
			
		case 'f':
			System.out.println("codee here updated");
			break;
			
		case 'u':
			System.out.println("code updated");
			break;
			
		case 'r':
			System.out.println("code for remove");
			break;
			
			default:
				
				break;
		}//switch close
		
		System.out.println("do you want to continue?");
		choice=ip.next().trim().charAt(0);
		}//close while
		
	}
	
	public static void readDetails() {
		System.out.println("Enter the contact details");
		System.out.println("enter the first name:");
		fname = ip.next();
		System.out.println("enter the last name:");
		lname=ip.next();
		System.out.println("enter the phone no");
		phNo=ip.next();
	}

}
