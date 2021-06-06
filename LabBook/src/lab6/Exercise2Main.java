package com.capgemini.lab6;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int n = sc.nextInt();
		char[] arr = new char[n];

		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		System.out.println("enter the character array:");
		for(int i=0;i<n;i++)
			arr[i]=sc.next().trim().charAt(0);
		count = Exercise2.countChar(arr);

		for (Entry<Character, Integer> data : count.entrySet()) {
			System.out.println(data);
			
		sc.close();
			
		}
	}

}
