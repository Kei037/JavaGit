package com.varxyz.jvx330.mvc.example6;

import com.varxyz.jvx330.mvc.example5.CustomerCommand;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountCommand {
	private CustomerCommand customerCommand;
	private String accountType;
	private double balance;
	private String accountNum;
	
}
