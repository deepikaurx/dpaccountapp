package com.qa.service;

import javax.inject.Inject;

import com.qa.business.repository.IAccountRepository;

public class AccountService implements IAccountService {
	@Inject
	private IAccountRepository repo;
	
	
	@Override
	public String getAllAccounts() {
		return repo.getAllAccounts();
	}


	@Override
	public String getAnAccount(Long id) {
		
		return repo.getAnAccount(id);
		
	}


	@Override
	public String createAccount(String jsonAccount) {
	
		return repo.createAccounts(jsonAccount);
	}
	
	@Override
	public String deleteAccount(Long id) {
		
		return repo.deleteAccount(id);
	}
	
	
	
	@Override
	public String updateAccount(String jsonAccount) {
		
		return repo.updateAccount(jsonAccount);
		
	}

	
	
	
}


