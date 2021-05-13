package arithmeticexpression;
import java.util.*;
public class InchToMeter {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		double inch=sc.nextDouble();
		double meter=inch*0.0254;
		 System.out.println(inch + " inch is " + meter + " meters");
		 sc.close();

		
	}
}
