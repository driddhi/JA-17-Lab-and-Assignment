package com.capgemini.lab9;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Space s = ()->{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string: ");
			return sc.next().replace(""," ").trim();
		};
		System.out.println("Output string: "+ s.addSpace());
	}

	

}
