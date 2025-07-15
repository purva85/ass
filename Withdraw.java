package com.aurionpro.model;

public class Withdraw {
	public void withdraw(BankAccount account, double amount) throws NegativeAmount, InsufficientFund {
		if(amount<=0) {
			throw new NegativeAmount("withdraw must br +ve");
		}
		if (account instanceof SavingAcc) {
            double newBalance = account.getBalance() - amount;
            if (newBalance < SavingAcc.MIN_BALANCE) {
                throw new InsufficientFund("Cannot withdraw, minimum balance must be maintained!");
            }
            account.setBalance(newBalance);
        } else if (account instanceof CurrentAcc) {
            double newBalance = account.getBalance() - amount;
            if (newBalance < CurrentAcc.OVERDRAFT_LIMIT) {
                throw new InsufficientFund("Overdraft limit exceeded!");
            }
            account.setBalance(newBalance);
        } else {
            throw new UnsupportedOperationException("Unknown account type");
        }
		System.out.println("Withdrawn: " + amount + ", New Balance: " + account.getBalance());
    }
}
	