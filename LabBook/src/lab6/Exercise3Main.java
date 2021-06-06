package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercise3Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the list:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		hMap = Exercise3.getSquares(arr);

		for (Entry<Integer, Integer> data : hMap.entrySet()) {
			System.out.println("square of each number");
			System.out.println(data);

		}
	}
}
