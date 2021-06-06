package com.capgemini.lab6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Exercise4 {
	 static HashMap<String, String> getStudents(HashMap<String, Integer> map) {
	        HashMap<String, String> medal = new HashMap<>();
	        Set<String> set = map.keySet();
	        for (String s: set) {
	            int marks = map.get(s);
	            if (marks >= 90)
	                medal.put(s, "Gold");
	            else if (marks >= 80 && marks < 90)
	                medal.put(s, "Silver");
	            else if (marks >= 70 && marks < 80)
	                medal.put(s, "Bronze");
	            else
	                medal.put(s, "No medal received!");
	        }
	        return medal;
	    }

	    public static void main(String[] args) {
	        HashMap<String, Integer> map = new HashMap<>();
	        map.put("S001", 86);
	        map.put("S002", 75);
	        map.put("S003", 99);
	        map.put("S004", 92);
	        map.put("S005", 88);
	        map.put("S006", 65);
	        map.put("S007", 77);

	        HashMap<String, String> ans = getStudents(map);
	        for (Entry<String, String> entry: ans.entrySet())
	            System.out.println(entry.getKey() + " : " + entry.getValue());

}
	    }
