package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		
		HashMap<String,Integer> hmp=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the list:");
		int n=sc.nextInt();
		
		System.out.println("Enter the list of fruits:");
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the fruit name as key value");
			String fname=sc.next();
			System.out.println("enter the price as value:");
			Integer price=sc.nextInt();
			hmp.put(fname,price);
		}
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list=getValues(hmp);
		
		System.out.println();
		
		for(int val : list)
			System.out.println(val);
		
		sc.close();
		
		
	}

	private static ArrayList<Integer> getValues(HashMap<String, Integer> hmp) {
		
		ArrayList<Integer>slist =new ArrayList<Integer>();
		slist.addAll(hmp.values());
		slist.sort(null);
		
		return slist;
		// TODO Auto-generated method stub
		
	}

}
