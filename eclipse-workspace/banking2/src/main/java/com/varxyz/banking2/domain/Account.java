package com.varxyz.banking2.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Account {
	private long aid;
	private Customer customer;
	private String accountNum;
	private char accType;
	private double balance;
	private Date regDate;
	
	public Account() {
		
	}
	
	//
	public abstract void transfer(); 
}
