package lab2;

import java.util.*;

public class SortString {
	
	public static String[] sortStrings(String[] arr) {
		Arrays.sort(arr);
		int len = arr.length, i;
		String newArray[] = new String[len];
		for(i = 0; i<(int)Math.ceil(len/2)+1; i++)
			newArray[i] = arr[i].toUpperCase();
		for(i = (int)Math.ceil(len/2)+1; i<len; i++)
			newArray[i] = arr[i].toLowerCase();
		return newArray;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int n = sc.nextInt();
		String array[] = new String[n];
		//Scanner sc2 = new Scanner(System.in);
		System.out.println("enter the strings::");
		for(int i=0; i<n; i++)
			array[i] = sc.nextLine();
		System.out.println("The resultant array is: ");
		String[] sortArray = sortStrings(array);
		for(String value : sortArray)
			System.out.println(value);
		sc.close();
		//sc2.close();
		
	}
	}
