package com.company.model;

public class AccountNumber {

	private int number;
	private String bank;

	public AccountNumber() {
	}

	public AccountNumber(int number, String bank) {
		super();
		this.number = number;
		this.bank = bank;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account number : " + this.number + " " + this.bank;
	}
}
