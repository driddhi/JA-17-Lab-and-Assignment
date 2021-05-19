package Polymorphism2;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transaction t = new Transaction();
		
		t.setAccountNumber(115768);
		t.execute();
		
		t = new BalanceEnquiry();
		t.execute();
		
		 t = new Withdrawl(20000);
		t.execute();
		 t = new Deposit(20000);
		 t.execute();
	}
}
