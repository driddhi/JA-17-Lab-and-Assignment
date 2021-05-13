import java.util.Scanner;

public class HarshadNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int r = 0, s = 0, m = num;
		
		while(num > 0)
		{
			r = num % 10;
			s += r;
			num /= 10;
		}
		if(m % s == 0)
			System.out.println("Harshad Number");
		else
			System.out.println("Not a Harshad Number");
	}

}