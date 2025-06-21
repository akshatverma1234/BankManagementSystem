package project;

import java.util.*;
public class Bank{
	private List<Account> accounts = new ArrayList<>();
	
	public void addAccount(Account account) {
		accounts.add(account);
		System.out.println(account+" Account added Successfully");
	}
	
	public Account findAccount(String accountNumber) {
		for(Account acc: accounts) {
			if(acc.getAccountNumber().equals(accountNumber)) {
				return acc;
			}
		}
		System.out.println("Account not found...");
		return null;
	}
	public void transferFund(String fromAccountNumber, String toAccountNumber,double amount) {
		Account fromAccount = findAccount(fromAccountNumber);
		Account toAccount = findAccount(toAccountNumber);
		if(null != fromAccount && null!=toAccount) {
			fromAccount.withdraw(amount);
			toAccount.deposit(amount);
			System.out.println("Transfered from "+fromAccount+"to account "+ toAccount);
		}else {
			System.out.println("transfered failed ");
		}
		
	}
}
