package com.google.bean;

public class AccountService {
	private Account account;

	public AccountService(Account account) {
		this.account=account;
	}
	public void getCredit(float amt) {
		account.credit(amt);
	}
}
