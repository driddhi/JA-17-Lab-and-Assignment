package controlstatement;
import java.util.*;
public class ArrayExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int i;
		int n=sc.nextInt();
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("using continue");
		for(i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				System.out.println(arr[i]);
				continue;
			}

			
				
		}
		System.out.println("using Break");
		for(i=0;i<n;i++)
		{
			if(arr[i]==0)
				break;
			
		}
	}

}
