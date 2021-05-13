import java.util.*;
public class PerfectNumber{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i,sum=0;
		for(i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			System.out.println(n+" is perfect.");
		else
			System.out.println(n+" is not perfect");
	}
}