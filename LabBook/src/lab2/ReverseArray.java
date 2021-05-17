package lab2;
import java.util.*;
public class ReverseArray {
	public static int[] getSorted(int[] arr) {
		int len = arr.length;
		Arrays.toString(arr);
		
		for(int i=0; i<len; i++) {
			StringBuffer s = new StringBuffer(String.valueOf(arr[i]));
			s.reverse();
		
			arr[i] = Integer.parseInt(String.valueOf(s));
		}
		Arrays.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for (int i=0; i<num; i++)
			a[i] = sc.nextInt();
		int[] b = getSorted(a);
		for(int element : b)
			System.out.println(element);
		sc.close();
	}

}
