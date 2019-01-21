package com.bank.model;

import com.bank.enumeration.EBankCard;

public class BankCardAccount extends SimpleAccount {

	private EBankCard cb;
	
	public BankCardAccount(String name, EBankCard cb ) {
		super(name);
		this.cb = cb;
	}
	
	public BankCardAccount(String name, float balance, EBankCard cb ) {
		super(name, balance);
		this.cb = cb;
	}
	
	@Override
	public String toString() {
		return "Bank card account [ " + this.getName() + ", " + this.getNumber() + ", " + this.getBalance() + "]";
	}
}
