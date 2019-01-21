package com.bank.model;

public class SimpleAccount {

	private static int count = 1;
	private String name;
	private int number;
	private float balance;
	private final static int COMISSION = 1;
	
	public SimpleAccount(String name) {
		this.number = SimpleAccount.count;
		this.name = name;
		SimpleAccount.count++;
	}
	
	public SimpleAccount(String name, float balance) {
		this.number = SimpleAccount.count;
		this.name = name;
		this.balance = balance;
		SimpleAccount.count++;
	}
	
	public void credit(float amountToCredit) {
		this.balance += amountToCredit;
		System.out.println("Your new balance after your credit of " + amountToCredit + " is " + this.balance);
	}
	
	public void debit(float amountToDebit) {
		if(this.balance >= amountToDebit) {
		this.balance -= amountToDebit;
		System.out.println("Your new balance after your debit of " + amountToDebit + " is " + this.balance);
		}else {
			System.out.println("Pailas! You don't have enough money here... Go away");
		}
	}
	
	public void transfert(float amountToTransfert, SimpleAccount accountTo) {
		if(this.balance >= amountToTransfert) {
			accountTo.setBalance(accountTo.getBalance() + amountToTransfert);
			this.setBalance(this.getBalance() - amountToTransfert - SimpleAccount.COMISSION);
			System.out.println("You just transfered " + amountToTransfert + " to " + accountTo.getName());
		}else {
			System.out.println("Pailas! You don't have enough money here... Go away");
		}
	}

	public static int getCount() {
		return count;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public float getBalance() {
		return balance;
	}

	public int getCOMISSION() {
		return COMISSION;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected void setBalance(float newBalance) {
		this.balance = newBalance;
	}

	@Override
	public String toString() {
		return "Simple account [ " + this.name + ", " + this.number + ", " + this.balance + "]";
	}
		
}
