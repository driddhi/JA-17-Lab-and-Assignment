package lab2;

import java.util.*;

public class SecondSmallest {
	
	public static int getSecondSmallest(int[] arr)
	{
		
		Arrays.sort(arr);
		
		return arr[1];
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the arry:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int x=getSecondSmallest(arr);
		System.out.println("The second smallest element in the array "+x);
		sc.close();
		
	}

}
