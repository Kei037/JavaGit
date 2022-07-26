package com.varxyz.banking;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCommand {
	private String eamil;
	private String accountNum;
	private char accountType;
	private double balance;
}
