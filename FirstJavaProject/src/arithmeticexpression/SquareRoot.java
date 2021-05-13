package arithmeticexpression;
import java.util.*;
public class SquareRoot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter:");
		int n=sc.nextInt();
		int d= (int)(Math.sqrt(n));
		if((d*d)==n)
			System.out.println(n+" is a perfect sqaure number");
		else
			System.out.println(n+" is not a perfect sqaure number");
		sc.close();
}
}
