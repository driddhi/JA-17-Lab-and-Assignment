package maxnumber.max;
import java.util.Scanner;

public class GreatestNum {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int max = (num1 > num2)?num1:num2;
			System.out.println("Greatest Number: "+max);
		}

	}


