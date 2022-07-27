package com.varxyz.banking.domain;

import com.varxyz.banking.command.AccountCommand;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingsAccount extends AccountCommand {
	private double interestRate = 2.0;
	
	public void withdraw(double amount) {
		
	}
}
