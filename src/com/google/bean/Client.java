package com.google.bean;

public class Client {

	public static void main(String[] args) {
		
		AccountService service = new AccountService(new CreditCardDao());
								//How can we avoid this object creation? Think...!!!
		
		service.getCredit(500);
		
		service = new AccountService(new SavingCardDao());
		
		service.getCredit(1000);

	}

}
