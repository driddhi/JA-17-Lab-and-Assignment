package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;

public class Exercise7 {

	public static int[] getSorted(int[] arr) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		int len=arr.length;
		for(int i=0;i<len;i++)
		{
			StringBuilder s=new StringBuilder(String.valueOf(arr[i]));
			s.reverse();
			arr[i]=Integer.parseInt(String.valueOf(s));
		}
		
		for(int a:arr)
			list.add(a);
		
		Collections.sort(list);
		
		int[] resultingArray = new int[len];
		for(int i=0;i<len;i++)
			resultingArray[i]=list.get(i);
		
		return resultingArray;
	}

}
