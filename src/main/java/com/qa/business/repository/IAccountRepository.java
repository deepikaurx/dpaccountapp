package com.qa.business.repository;

public interface IAccountRepository {

	String getAllAccounts();
	
	String getAnAccount(Long id);

	String createAccounts(String accountJSON);

	String deleteAccount(Long id);
	
	String updateAccount(String accountJSON);


}