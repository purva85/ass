package com.aurionpro.model;
import com.aurionpro.model.BankAccount;



public class Deposit {
	public void deposit(BankAccount account, double amount) throws NegativeAmount {
		if(amount<=0) {
			throw new NegativeAmount("Deposit must be +ve");
		}
		account.setBalance(account.getBalance()+amount);
		System.out.println("Deposited: "+amount+", balance: "+account.getBalance());
	}

}
