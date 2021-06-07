package com.capgemini.lab9;

public class Fact {
	
	
	public static int calculateFact(int n) {
		int result = 1;
		for(int i=1; i<=n; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Factorial f = Fact::calculateFact;
		
		System.out.println(f.test(5));
		
	}

}
