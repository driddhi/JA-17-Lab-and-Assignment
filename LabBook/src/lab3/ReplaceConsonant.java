package lab3;
import java.util.*;
public class ReplaceConsonant {
	
	static boolean isVowel(char ch)
    {
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u')
        {
            return false;
        }
        return true;
    }
	
	public static String alterString(String s1)
	{
		int len=s1.length();
		char[] s2=new char[len];
		s1.toLowerCase();
		s2=s1.toCharArray();
		
		
		for(int i=0;i<len;i++)
		{
			
			{
				if(!isVowel(s2[i]))
					if(s2[i]=='z')
						s2[i]='a';
					else
						s2[i]=(char)(s2[i]+1);
					
			}
		}
		String s=String.valueOf(s2);
		return s;
		
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s=alterString(s1);
		System.out.println(s);
		sc.close();
	}
}
