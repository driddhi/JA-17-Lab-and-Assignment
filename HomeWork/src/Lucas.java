public class Lucas{
	public static void main(String[] args) {
		int x=2;
		int y=1;
		int z=3;
		System.out.println("First 10 numbers of the Lucas Sequence::");
		System.out.println(x);
		System.out.println(y);
		int a;
		while(z<=10)
		{
			a=x+y;
			System.out.println(a);
			x=y;
			y=a;
			z=z+1;
	}
		
	}
}
