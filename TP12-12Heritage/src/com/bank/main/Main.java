package com.bank.main;

import com.bank.enumeration.EBankCard;
import com.bank.model.AllAccounts;
import com.bank.model.BankCardAccount;
import com.bank.model.SimpleAccount;
import com.bank.model.VIPAccount;

public class Main {

	public static void main(String[] args) {
		
		SimpleAccount account1 = new SimpleAccount("Martinez", 500);
		VIPAccount account2 = new VIPAccount("Jojo", 800);
		BankCardAccount account3 = new BankCardAccount("Perez", 500, EBankCard.VISAPREMIER);
		
		AllAccounts accounts = new AllAccounts();
		accounts.addAccount(account1);
		accounts.addAccount(account2);
		accounts.addAccount(account3);
		
		System.out.println(accounts.toString());
		
		account1.credit(300);
		account2.debit(2000);
		account3.transfert(100, account1);
		account1.debit(2000);
		
		System.out.println(accounts.toString());
		
	}

}
