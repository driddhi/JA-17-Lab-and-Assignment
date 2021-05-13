import java.util.*;

public class Repeat{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int a[]=new int[10];
		while(l!=0)
		{
			int r=l%10;
			a[r]++;
			l=l/10;
		}
		for(int i=0;i<10;i++) {
			if(a[i]>1)
				System.out.println(i+" is repeated "+a[i]+" times.");
			}
		
	}
}