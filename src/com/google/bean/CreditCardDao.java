package com.google.bean;

public class CreditCardDao implements Account{
	
	public CreditCardDao() {
		System.out.println("CreditCardDao is initialized...");
	}

	@Override
	public void credit(float amt) {
		System.out.println("Your credit account is credited " + amt + ".");
	}

}
