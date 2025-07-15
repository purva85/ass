package com.aurionpro.model;

public class BankAccount {
	private String accountNumber;
	private double balance;
	
	public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
    public void deposit(double amount) throws NegativeAmount {
        if (amount <= 0) {
            throw new NegativeAmount("Deposit amount must be greater than zero.");
        }
        balance += amount;
    }


    public void withdraw(double amount) throws NegativeAmount, InsufficientFund {
        if (amount <= 0) {
            throw new NegativeAmount("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFund("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }
	
	public String toString() {
		return String.format("BankAccount[accountNumber=%s, balance=%.2f]", accountNumber, balance);
	}
	
//	
	

}
