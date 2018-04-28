package com.qa.service;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.qa.domain.Account;
import com.qa.util.JSONUtil;


@RunWith(MockitoJUnitRunner.class)
public class AccountServiceTest {


	
	private AccountService service;
	private Account joeBloggs;
	private Account janeBloggs;
	private JSONUtil util;

	@Before
	public void init() {
		service = new AccountService();
		joeBloggs = new Account("Joe", "Bloggs", "1234");
		janeBloggs = new Account("Jane", "Bloggs", "1234");
		util = new JSONUtil();
	}
	
	@Test
	public void getAllTest() {
	
	}
	
	
	@Test
	public void createTest() {
	
	}
	
	
	@Test
	public void deleteTest() {
	
	}
	
	
	

	
	

}
