public class Kaprekar {
	
	static boolean kaprekar(int n)   
    {   
        if (n == 1)   
           return true;   
        int square = n * n;   
        int count_digits = 0;   
        while (square != 0)   
        {   
            count_digits++;   
            square /= 10;   
        }   
        square= n*n;   
        for (int r=1; r<count_digits; r++)   
        {   
             int eq_parts = (int) Math.pow(10, r);   
            if (eq_parts == n)   
                continue;   
             int sum = square/eq_parts + square % eq_parts;   
             if (sum == n)   
               return true;   
        }   
        return false;   
    }       

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<1000; i++)   
            if (kaprekar(i))   
                 System.out.println(i + " "); 
	}

}