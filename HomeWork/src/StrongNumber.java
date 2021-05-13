import java.util.*;
public class StrongNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int r,fact,m,s=0;
		m=n;
		while(n>0)
		{
			r=n%10;
			fact=1;
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			s=s+fact;
			n=n/10;
			
		}
		if(s==m)
			System.out.println("Strong number");
		else
			System.out.println("not a strong number");
	}

}
