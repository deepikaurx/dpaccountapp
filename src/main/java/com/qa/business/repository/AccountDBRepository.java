package com.qa.business.repository;


import static javax.transaction.Transactional.TxType.SUPPORTS;
import static javax.transaction.Transactional.TxType.REQUIRED;

import java.util.Collection;


import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.apache.log4j.Logger;

import com.qa.domain.Account;
import com.qa.util.JSONUtil;


public class AccountDBRepository implements IAccountRepository {
	


	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;
	
	public String getAllAccounts() {
		Query query = manager.createQuery("Select a FROM Account a");
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(accounts);
	}

	@Override
	public String getAnAccount(Long id) {
		 Account acc = findAccount(id);
		 if(acc != null) {
			 return util.getJSONForObject(acc);
			 
		 } else {
			 return  "{\"message\":\"account not found\"}";
		 }
	
	}

	private Account findAccount(Long id) {
	 return manager.find(Account.class, id);
		
	}

	@Override
	@Transactional(REQUIRED)
	public String createAccounts(String accountJSON) {
		Account acc = util.getObjectForJSON(accountJSON, Account.class);
				manager.persist(acc);;
				return "{\"message\":\"Account created\"}";

	}


	@Override
	@Transactional(REQUIRED)
	public String deleteAccount(Long id) {
		Account acc = findAccount(id);
		if (acc != null) {
			manager.remove(acc);
			return "{\"message\": \"Account deleted!!\"}";
		}
		else {
			return "{\"message\": \"Account not found\"}";
		}
		
	}
	
	@Override
	@Transactional(REQUIRED)
	public String updateAccount(String accountJSON) {
		Account updateAccount = util.getObjectForJSON(accountJSON, Account.class);
		Account acc = findAccount(new Long(updateAccount.getId()));
		if(acc != null) {
		acc = updateAccount;
		acc.merge(acc);
		return "{\"message\":\"Account updated\"}";
		} else {
			return "{\"message\":\"Could not update Account\"}";
		}
		
	}

}
