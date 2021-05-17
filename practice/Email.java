import java.util.*;
import java.util.regex.*;

public class Email {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	String mail=sc.next();
	
	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
            "[a-zA-Z0-9_+&*-]+)*@" +
            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
            "A-Z]{2,7}$";
              
	Pattern pat = Pattern.compile(emailRegex);
	
		if(pat.matcher(mail).matches())
			System.out.println("Contins");
		else
			System.out.println("Doesn't contain");
		
		sc.close();
	
	}
}
	
	


