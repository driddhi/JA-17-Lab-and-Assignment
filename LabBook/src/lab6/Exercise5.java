/**
 * 
 */
package com.capgemini.lab6;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

/**
 * @author Riddhi Das
 *
 */
public class Exercise5 {

	public static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		for (int i : arr)
		{
		   alist.add(i);
		}
		Collections.sort(alist);
		int secondSmallest = alist.get(1);
		
		return secondSmallest;
	}
		
}
