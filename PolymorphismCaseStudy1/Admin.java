package casestudypolimorphism;

public class Admin extends Pyroll {
private int salary;
private String name;
	
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
	
	public Admin(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public void adjustSalary(int val)
	{
		salary += val;
		System.out.println("Adjusted Salary is - "+salary);
	}
	
	public void doAdminStuff()
	{
		System.out.println("Not enough instructions given...");
	}
}