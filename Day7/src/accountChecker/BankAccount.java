package accountChecker;

import java.util.*;

class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}

class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

class LowBalanceException extends Exception {
 public LowBalanceException(String message) {
     super(message);
 }
}

public class BankAccount {
 private int accno;
 private String custname;
 private String acctype;
 private float balance;

 public BankAccount(int accno, String custname, String acctype, float initialBalance) throws LowBalanceException, InvalidAmountException {
     this.accno = accno;
     this.custname = custname;
     this.acctype = acctype;
     if (initialBalance < 0) {
         throw new InvalidAmountException("Initial balance cannot be negative.");
     }
     if (acctype.equalsIgnoreCase("Savings") && initialBalance < 1000) {
         throw new LowBalanceException("Minimum balance for savings account is Rs.1000.");
     }
     if (acctype.equalsIgnoreCase("Current") && initialBalance < 5000) {
         throw new LowBalanceException("Minimum balance for current account is Rs.5000.");
     }
     this.balance = initialBalance;
 }



public BankAccount(float balance) {
	super();
	this.balance = balance;
}



public void deposit(float amt) throws InvalidAmountException {
     if (amt < 0) {
         throw new InvalidAmountException("Deposit amount cannot be negative.");
     }
     balance += amt;
 }

 public void withdraw(float amt) throws InvalidAmountException, InsufficientFundsException {
     if (amt < 0) {
         throw new InvalidAmountException("Withdrawal amount cannot be negative.");
     }
     if (acctype.equalsIgnoreCase("Savings") && balance - amt < 1000) {
         throw new InsufficientFundsException("Insufficient funds for savings account.");
     }
     if (acctype.equalsIgnoreCase("Current") && balance - amt < 5000) {
         throw new InsufficientFundsException("Insufficient funds for current account.");
     }
     balance -= amt;
 }

 public float getBalance() {
     return balance;
 }

 public static void main(String[] args) {
     try {
         BankAccount savingsAccount = new BankAccount(101, "John Doe", "Savings", 1500);
         System.out.println("Initial balance: Rs. " + savingsAccount.getBalance());
         savingsAccount.deposit(500);
         System.out.println("After deposit: Rs. " + savingsAccount.getBalance());
         savingsAccount.withdraw(200);
         System.out.println("After withdrawal: Rs. " + savingsAccount.getBalance());

         } 
     catch (InvalidAmountException | InsufficientFundsException | LowBalanceException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }



public int getAccno() {
	return accno;
}



public void setAccno(int accno) {
	this.accno = accno;
}



}
