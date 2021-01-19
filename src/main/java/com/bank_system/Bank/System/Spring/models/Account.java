package com.bank_system.Bank.System.Spring.models;

public class Account {
	
	private double balance;
	private double minimumAmount = 20;
	
	static Account account;
	
	private Account(){
		this.balance = 0;
	}
	
	public static Account getInstance() {
		if (account == null) {
			account = new Account();
			account.balance = 0;
		}
		return account;
	}

	public String setBalance(double temp) {
		this.balance = this.balance + temp;
		return ("Successfully deposited " + temp);
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String withdraw(double temp) {
		if ((this.balance < 20) || ((this.balance - temp) < 20)) {
			return "Current balance must be 20 or greater!";
		}
		this.balance = this.balance - temp;
		return (temp + " withdrawn from account!");
	}

}
