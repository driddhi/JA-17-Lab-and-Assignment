package com.capgemini.lab6;

import java.util.HashMap;

public class Exercise2 {

	public static HashMap<Character, Integer> countChar(char[] arr) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		int count = 0;
		int len = arr.length;

		for(char c : arr) {
			if(charCount.containsKey(Character.valueOf(c))) {
				charCount.replace(Character.valueOf(c), 
				charCount.get(Character.valueOf(c)) + 1);
			}
			else {
				charCount.put(Character.valueOf(c), 1);
			}
		}

		// TODO Auto-generated method stub
		return charCount;
	}

}
