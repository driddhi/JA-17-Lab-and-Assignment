package casestudypolimorphism;

public class Academic extends Pyroll {
	
	 private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Academic(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void adjustSalary(int val)
	{
		salary += val;
		System.out.println("Adjusted Salary is - "+salary);
	}
	
	public void giveLecture()
	{
		System.out.println("Not enough instructions given...");
	}
}

