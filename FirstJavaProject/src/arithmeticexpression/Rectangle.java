package arithmeticexpression;

import java.util.Scanner;

public class Rectangle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		
		System.out.println("area= "+(l*b)+"Perimeter="+(2*(l+b)));
		sc.close();
	}

}
