package com.capgemini.lab6;

import java.util.HashMap;

public class Exercise3 {

	public static HashMap<Integer, Integer> getSquares(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> square=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			square.put(i,(i*i));
		}
		
		return square;
	}

}
