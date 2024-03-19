package com.ey.program2;


public class Account {
 private int accountNumber;
 private String accountType;
 private double balance;

public int getAccountNumber() {
	return accountNumber;
}


public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}


public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}


public class Test {
	 public static void main(String[] args) {
	     ConsumerAccount consumerAccount = new ConsumerAccount();
	     CommercialAccount commercialAccount = new CommercialAccount();

	     consumerAccount.deposit(500.0);
	     try {
	         consumerAccount.withdraw(200.0);
	     } catch (AccountException e) {
	         System.err.println("Error: " + e.getMessage());
	     }
	     System.out.println("Consumer Account Balance: " + consumerAccount.getBalance());

	     commercialAccount.deposit(1000.0);
	     try {
	         commercialAccount.withdraw(2000.0);
	     } catch (AccountException e) {
	         System.err.println("Error: " + e.getMessage());
	     }
	     System.out.println("Commercial Account Balance: " + commercialAccount.getBalance());
	 }
	}

