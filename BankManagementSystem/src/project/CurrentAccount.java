package project;

public class CurrentAccount extends Account{
	
	private double overdraftLimit;
	
	public CurrentAccount(String accountNumber, String accountHolder, double balance,double overdraftLimit) {
		super(accountNumber,accountHolder,balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		if(amount <= balance + overdraftLimit) {
			balance-=amount;
			System.out.println(amount+" Withdraw successfully. New balance is :"+ balance);
		}
		else {
			System.out.println("Withdraw exceeds overdraftlimit");
		}
			
	}
}
