package com.google.bean;

public class SavingCardDao implements Account{

	public SavingCardDao() {
		System.out.println("SavingCardDao is initialized.");
	}
	
	@Override
	public void credit(float amt) {
		System.out.println("Your saving account is credited " + amt +".");
	}

}
