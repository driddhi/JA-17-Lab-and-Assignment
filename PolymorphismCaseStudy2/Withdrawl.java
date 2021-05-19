package Polymorphism2;

public class Withdrawl extends Transaction{
	private double amount;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void execute() {
		System.out.println(amount +"withdrawn");
	}

	public Withdrawl(double amount) {
		super();
		this.amount = amount;
	}

}
