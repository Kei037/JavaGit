package com.varxyz.banking.command;

import java.util.Date;

import com.varxyz.banking.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class AccountCommand {
	private String email;
	private String accountNum;
	private char accountType;
	private double balance;
	private Customer customer;
	private long cid;
	private Date regDate;
	
	public AccountCommand() {
		super();
	}
}
