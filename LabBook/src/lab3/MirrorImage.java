package lab3;
import java.util.Scanner;
public class MirrorImage {
	
	
	public static String getImage(String s1)
	{
		StringBuffer sbf=new StringBuffer(s1);
		sbf.reverse();
		String ss=sbf.toString();
		return ss;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		
		String s2= getImage(s1);
		System.out.println(s1+"|"+s2);
		sc.close();
		
	}

}
