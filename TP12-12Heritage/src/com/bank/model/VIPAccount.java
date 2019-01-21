package com.bank.model;

public class VIPAccount extends SimpleAccount{

	public VIPAccount(String name) {
		super(name);
	}
	
	public VIPAccount(String name, float balance ) {
		super(name, balance);
	}
	
	public void debit(float amountToDebit) {
		this.setBalance(this.getBalance() - amountToDebit);
		System.out.println("Your new balance after your debit of " + amountToDebit + " is " + this.getBalance());
	}
	
	@Override
	public void transfert(float amountToTransfert, SimpleAccount accountTo) {
			accountTo.setBalance(accountTo.getBalance() + amountToTransfert);
			this.setBalance(this.getBalance() - amountToTransfert);
			System.out.println("You just transfered " + amountToTransfert + " to " + accountTo.getName());
	}
	
	@Override
	public String toString() {
		return "VIP account [ " + this.getName() + ", " + this.getNumber() + ", " + this.getBalance() + "]";
	}
	
}
