package project;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank();
		CurrentAccount current = new CurrentAccount("ABC234", "Akshat", 2000, 2.5);
		SavingsAccount savings = new SavingsAccount("TBG223", "Karan",5000, 2000);
		
		bank.addAccount(current);
		bank.addAccount(savings);
		savings.deposit(3000);
		current.withdraw(1000);
		current.checkBalance();
		savings.checkBalance();
	}
}
	
