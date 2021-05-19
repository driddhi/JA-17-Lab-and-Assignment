package casestudypolimorphism;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Academic a1 = new Academic("Dave", 20000);
		
		Admin a2 = new Admin("Kate", 40000);
		
		System.out.println(a1.getName());
		System.out.println(a1.getSalary());
		a1.adjustSalary(10000);
		
		System.out.println(a2.getName());
		System.out.println(a2.getSalary());
		a2.adjustSalary(-10000);
	}



}
