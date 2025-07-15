package com.aurionpro.model;

public class CurrentAcc extends BankAccount {
	public static final double OVERDRAFT_LIMIT=-1500;
	
	public CurrentAcc(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

}
