package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	
	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String firstname;
private String lastname;
private String accountnumber;



public Account() {
	
}


public Account(String firstname, String lastname,String accountnumber ) {
	this.firstname = firstname;
	this.lastname = lastname;
	this.accountnumber = accountnumber;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getFirstname() {
	return firstname;
}


public void setFirstname(String firstname) {
	this.firstname = firstname;
}


public String getLastname() {
	return lastname;
}


public void setLastname(String lastname) {
	this.lastname = lastname;
}


public String getAccountnumber() {
	return accountnumber;
}


public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}




}
