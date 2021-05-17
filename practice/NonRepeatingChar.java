import java.util.*;
public class NonRepeatingChar {
	

	
		static final int NO_OF_CHARS = 256;
		static char count[] = new char[NO_OF_CHARS];

	  	static void get_char_count(String str)
		{
			for (int i = 0; i < str.length(); i++)
				count[str.charAt(i)]++;
		}

		static int firstNonRepeatingCharacter(String str)
		{
			get_char_count(str);
			int index = -1, i;

			for (i = 0; i < str.length(); i++)
			{
				if (count[str.charAt(i)] == 1)
					{
						index = i;
						break;
					}
			}
		return index;
	}

		public static void main (String[] args)
		{	
			String str;
			Scanner sc = new Scanner(System.in);
			str = sc.nextLine();
			int index = firstNonRepeatingCharacter(str);

			System.out.println("First non-repeating character is " + str.charAt(index));
			sc.close();
		}
	}


