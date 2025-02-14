package com.capgemini.bank_transaction_system;

public class BankAccountSystem {

    //define attribute balance to keep record of balance
    private double balance;

    public BankAccountSystem(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Your new balance is: "+ balance);
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    public int withdraw(double amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        if(amount < 0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        else System.out.println("Withdrawal successful, new balance: "+ (balance - amount));
        return (int)(balance-amount);
    }
}
