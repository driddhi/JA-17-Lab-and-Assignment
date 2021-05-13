import java.util.*;
public class SumOfInt {
	
	
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=calculateSum(n);
		System.out.println("the sum of first n natural numbers which are divisible by 3 or 5 is "+s);
		sc.close();
	}

}
