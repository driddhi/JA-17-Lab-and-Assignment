package com.capgemini.lab9.exercise4;

public class Main {
	public static void main(String[] args) {
		
		int num=5;
		Number nm=new Number();
		Reference ref=(nm::getNum);
		
		ref.getNumber();
		Reference1 ref1=(nm::setNum);
		ref1.setNumber(num);
	}

}
