package com.capgemini.lab6;

import java.util.Scanner;

public class Exercise7Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int n=sc.nextInt();
		int[] sortedArray=new int[n];
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		
		
		sortedArray=Exercise7.getSorted(arr);
		
		for(int i:sortedArray)
			System.out.println(i);
	}

}
