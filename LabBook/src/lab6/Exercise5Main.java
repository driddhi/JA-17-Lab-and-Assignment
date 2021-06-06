package com.capgemini.lab6;

import java.util.Scanner;

public class Exercise5Main {
	public static void main(String[] args) {
		
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length of the array");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("enter the element of the array");
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int secondSmallest=Exercise5.getSecondSmallest(arr);
	
	System.out.println("the second smallest element in the array is "+secondSmallest);
	sc.close();
	
	
	
	
	}
	
}
