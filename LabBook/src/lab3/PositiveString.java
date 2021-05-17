package lab3;
import java.util.*;
public class PositiveString {
	public static boolean positiveString(String str1)
	{
		int flag=0;
		int len=str1.length();
		str1.toUpperCase();
		char arr[]=str1.toCharArray();
		for(int i=1;i<len;i++)
		{
			if((int)arr[i]>(int)arr[i-1])
				flag=1;
			else
				flag=0;
		}
		if(flag==1)
			return true;
		return false;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		if(positiveString(str)) 
			System.out.println("The string is positive");
		else
			System.out.println("The string is not positive");
				
		sc.close();
	}

}
