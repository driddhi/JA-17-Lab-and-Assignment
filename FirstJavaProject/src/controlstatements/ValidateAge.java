package controlstatements;
import java.util.Scanner;
public class ValidateAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>18)
			System.out.println("Valide");
		else
			System.out.println("not valid");
	}

}
