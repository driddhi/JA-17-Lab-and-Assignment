import java.util.Scanner;

public class DisariumNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int n = sc.nextInt();
		int temp=n;
		int m=n;
		int l = 0;
		while(n != 0)
		{
			l += 1;
			n /= 10;
		}
		int r = 0, sum = 0;
		while(temp > 0) {
			r = n % 10;
			sum += (int)Math.pow(r, l);
			temp /= 10;
			l--;
		}
		if(sum == m)
			System.out.println("Disarium Number");
		else
			System.out.println("Not a Disarium Number");
	}

}