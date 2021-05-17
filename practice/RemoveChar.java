import java.util.*;
public class RemoveChar {

	
	static void removeChar(String s, char c)
	{
	    int j=0, count = 0, len = s.length();
	    char []t = s.toCharArray();
	    for (int i=0; i < len; i++)
	    {
	        if (t[i] != c) {
	        	t[j] = t[i];
	        	j++;
	        	}
	        else
	            count++;
	    }
	     
	    while(count > 0)
	    {
	        t[j++] = '\0';
	        count--;
	    }
	     
	    System.out.println(t);
	}
	 

	public static void main(String[] args)
	{
	         String str;
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();
	    char ch=sc.next().charAt(0);
	    removeChar(str, ch);
	    sc.close();
	}
	
}
