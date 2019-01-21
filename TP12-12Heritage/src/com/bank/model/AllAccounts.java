package com.bank.model;

import java.util.ArrayList;
import java.util.List;

public class AllAccounts {

	List<SimpleAccount> accounts = new ArrayList<SimpleAccount>();
	
	public void addAccount(SimpleAccount account) {
		this.accounts.add(account);
	}

	@Override
	public String toString() {
		return "All Accounts [accounts=" + accounts + "]";
	}
	
	
}
