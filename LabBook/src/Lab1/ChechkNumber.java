import java.util.*;
public class ChechkNumber {
	public static boolean checkNumber(int n)
	{
		
			boolean flag = true;
		    int currentDigit = n % 10;
		    n = n /10;
		    while(n > 0) {
		    	if(currentDigit <= n % 10){
		    		flag = false;
		            break;
		    	}
		    	currentDigit = n % 10;
		        n = n / 10;
		    }
		    return flag;
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(checkNumber(number))
			System.out.println(number+" is increasing");
		else	
			System.out.println(number+" is not increasing");
		
		sc.close();
	}

}
