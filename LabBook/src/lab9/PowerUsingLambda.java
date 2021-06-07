package com.capgemini.lab9;

import java.util.Scanner;

public class PowerUsingLambda {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	int x,y;
	System.out.println("enter the value of x and y:");
	x=sc.nextInt();
	y=sc.nextInt();
	Exercise1Power p=(a,b)->{
	System.out.println("x^y will be:"+Math.pow(a,b));
	};
	
	p.power(x,y);

	}
}