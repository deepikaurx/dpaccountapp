package com.qa.service;

public interface IAccountService {
	String getAllAccounts();

	String getAnAccount(Long id);
	
	String createAccount(String jsonAccount);
	
	String deleteAccount(Long id);

	String updateAccount(String jsonAccount);
	
}
