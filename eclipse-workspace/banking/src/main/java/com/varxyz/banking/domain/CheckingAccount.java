package com.varxyz.banking.domain;

import com.varxyz.banking.command.AccountCommand;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends AccountCommand {
	private double overdraftAmount = 2.0;
	
}
