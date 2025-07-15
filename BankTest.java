package com.aurionpro.test;

import com.aurionpro.model.BankAccount;
import com.aurionpro.model.CurrentAcc;
import com.aurionpro.model.Deposit;
import com.aurionpro.model.SavingAcc;
import com.aurionpro.model.Withdraw;

public class BankTest {
    public static void main(String[] args) {
        BankAccount a1 = new SavingAcc("101", 1000);
        BankAccount a2 = new CurrentAcc("102", 5000);

        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();

        System.out.println("Account a1 (" + a1.getClass().getSimpleName() + ") started with balance: " + a1.getBalance());
        try {
            deposit.deposit(a1, 200);
            System.out.println("Deposited: 200.0 , New Balance: " + a1.getBalance() + " (" + a1.getClass().getSimpleName() + ")");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("----------------------");

        System.out.println("Account a2 (" + a2.getClass().getSimpleName() + ") started with balance: " + a2.getBalance());
        try {
            withdraw.withdraw(a2, 300);
            System.out.println("Withdrawn: 300.0 , New Balance: " + a2.getBalance() + " (" + a2.getClass().getSimpleName() + ")");

            deposit.deposit(a2, 500);
            System.out.println("Deposited: 500.0 , New Balance: " + a2.getBalance() + " (" + a2.getClass().getSimpleName() + ")");

            withdraw.withdraw(a2, 6000);
            System.out.println("Withdrawn: 6000.0 , New Balance: " + a2.getBalance() + " (" + a2.getClass().getSimpleName() + ")");
            
            withdraw.withdraw(a2, 9000);
            System.out.println("Withdrawn: 9000.0 , New Balance: " + a2.getBalance() + " (" + a2.getClass().getSimpleName() + ")");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("----------------------");
    }
}
	