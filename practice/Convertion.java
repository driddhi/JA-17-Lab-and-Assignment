import java.util.*;
public class Convertion {
	
	    public static void main(String[] args)
	    {
	Scanner sc=new Scanner(System.in);
	char str =sc.next().charAt(0);
	
	         if(str>=97 && str<=122)
	        System.out.println("This is Letter");
	        else if(str>=48 && str<=57)
	System.out.println("This is Digit");
	         sc.close();
	    }
	}
