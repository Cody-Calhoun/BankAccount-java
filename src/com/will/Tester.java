package com.will;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount();
		BankAccount account3 = new BankAccount();
		BankAccount account4 = new BankAccount();
		
		account1.depositMoney(24.91, "checking");
		account2.depositMoney(300.50, "savings");
		account3.depositMoney(500000.00, "savings");
		account4.depositMoney(.10, "checking");
		
		account3.displayAccountBalance();
		

	}

}
