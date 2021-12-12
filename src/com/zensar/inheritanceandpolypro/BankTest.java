package com.zensar.inheritanceandpolypro;

class Bank {
	private double fixedDeposits;
	private double cashCredit;

	public Bank() {
	}

	public Bank(double fixedDeposits, double cashCredit) {
		super();
		this.fixedDeposits = fixedDeposits;
		this.cashCredit = cashCredit;
	}

	public double getFixedDeposits() {
		return fixedDeposits;
	}

	public double getCashCredit() {
		return cashCredit;
	}

}

class SavingAccount extends Bank {
	private double fixedDeposits = 20000;

	public SavingAccount() {
	}

	public SavingAccount(double fixedDeposits) {
		this.fixedDeposits = fixedDeposits;
	}

	public double getFixedDeposits() {
		return fixedDeposits;
	}

}

class CurrentAccount extends Bank {
	private double cashCredit = 30000;

	public CurrentAccount() {
	}

	public CurrentAccount(double cashCredit) {
		this.cashCredit = cashCredit;
	}

	public double getCashCredit() {
		return cashCredit;
	}

}

public class BankTest {

	public static void main(String[] args) {
//		Bank currentAcc = new CurrentAccount(10000);
//		Bank savingAcc = new SavingAccount(15000);
		
		Bank currentAcc = new CurrentAccount();
		Bank savingAcc = new SavingAccount();
		
		System.out.println("Total cash in the bank = " + (currentAcc.getCashCredit() + savingAcc.getFixedDeposits()));
	}

}
