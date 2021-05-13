import java.util.*;
public class DifferenceOfSum {
	
	public static int calculateDifference(int n)
	{
		int sum1,sum2,difference;
		sum1=n*(n+1)*(2*n+1/6);
		
		sum2=n*(n+1)/2;
		
		difference=sum1-(sum2*sum2);
		return difference;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=calculateDifference(n);
		System.out.println("Difference is:"+d);
		sc.close();
		
		}

}
