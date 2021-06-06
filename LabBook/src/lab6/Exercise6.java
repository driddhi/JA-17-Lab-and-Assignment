package com.capgemini.lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise6 {

	public static ArrayList<String> votersList(HashMap<String, Integer> hmp) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		
		for(Map.Entry ent:hmp.entrySet())
		{
			String id=(String)ent.getKey();
			int age=(int)ent.getValue();
			if(age>=18)
				list.add(id);
		}
		return list;
	}

}
