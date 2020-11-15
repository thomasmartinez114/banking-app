import java.util.Scanner;

public class Account {
	// Class variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;
	
	// Constructor
	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}
	
	// function for Depositing money
	void deposit(int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	// function for Withdrawing money
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	// function showing the previous transaction
	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occurred");
		}
	}
}
