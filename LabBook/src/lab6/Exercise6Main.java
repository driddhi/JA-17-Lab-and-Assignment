package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise6Main {
	
	public static void main(String[] args) {
		HashMap<String,Integer> hmp=new HashMap<String,Integer>();
		ArrayList<String> list=new ArrayList<String>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of voters:");
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the ID as key:");
			String id=sc.next();
			System.out.println("enter the dob:");
			Integer age=sc.nextInt();
			hmp.put(id,age);
		}
		
		list=Exercise6.votersList(hmp);
		
		for(String a:list)
			System.out.println(a);
		
		sc.close();
		}
	
}
