public class HappyNumber {

	public static int happy(int num)
	{
		int r = 0, s = 0;
		
		while(num > 0)
		{
			r = num%10;
			s += (r*r);
			num /= 10;
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c= 0, i = 1;
		
		while(i>0)
		{
			int result = i;
			while(result != 1 && result != 4)
			{
				result = happy(result);
			}
			if(result == 1)
			{
				System.out.println(i + " ");
				c++;
			}
			i++;
			if(c == 10)
				break;
		}
	}

}