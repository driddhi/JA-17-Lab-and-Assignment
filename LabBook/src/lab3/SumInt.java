package lab3;
import java.util.*;
public class SumInt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		String s=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(s);
		
		
		while(st.hasMoreTokens())
		{
			String str=st.nextToken();
			int num=Integer.parseInt(str);
			sum+=num;
			System.out.println(str);
		}
		System.out.println("Sum is:"+sum);
		sc.close();
	}
}
