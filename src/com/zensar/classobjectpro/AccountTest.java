package com.zensar.classobjectpro;

import com.zensar.execptions.InsufficientBalanceException;

class Account {
	private int accountNumber;
	private String accHolderName;
	private double accBalance;

	public Account() {
	}

	public Account(int accountNumber, String accHolderName, double accBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accHolderName = accHolderName;
		this.accBalance = accBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public void print() {
		System.out.println("Account no.: " + accountNumber);
		System.out.println("Name of account holder: " + accHolderName);
		System.out.println("Account Balance: " + accBalance);
	}

	public void deposit(int accNo, String accName, long depositAmount) {
		this.accBalance = this.accBalance + depositAmount;
	}

	public void withdraw(int accNo, String accName, long withdrawAmount) throws InsufficientBalanceException {
		if (this.accBalance > withdrawAmount)
			this.accBalance = this.accBalance - withdrawAmount;
		else
			throw new InsufficientBalanceException("You have not sufficient balance");
	}
}

// Define own exception
//class InsufficientBalanceException extends Exception {
//	public InsufficientBalanceException(String str) {
//		// Calling constructor of parent Exception
//		super(str);
//	}
//}

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account(101, "Manish", 1000);
		account.print();

		account.deposit(101, "Manish", 1000);
		System.out.println("After deposit account balance is =");
		account.print();

		try {
			account.withdraw(101, "Manish", 2500);
			System.out.println("After withdraw account balance is =");
			account.print();
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
