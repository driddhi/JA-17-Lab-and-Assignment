package Polymorphism2;

public class Transaction {
	int accountNumber;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void execute()
	{
		System.out.println("Account Number is:"+accountNumber);
	}
}
