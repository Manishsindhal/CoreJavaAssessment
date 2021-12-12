package com.zensar.execptions;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
