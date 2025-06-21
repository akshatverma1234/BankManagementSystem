package project;

public class Account {
	private String accountNumber;
	private String accountHolder;
	protected double balance;
	
	public Account(String accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+" deposited. New balance is"+ balance);
	}
	public void withdraw(double amount) {
		if(amount<=balance) {
			System.out.println(amount+" withdraw. New balance is"+ balance);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	public void checkBalance() {
		System.out.println("Your Balance is : "+ balance);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
