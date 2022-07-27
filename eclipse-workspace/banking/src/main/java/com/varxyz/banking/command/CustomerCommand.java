package com.varxyz.banking.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class CustomerCommand {
	private String email;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
	
	public CustomerCommand() {
		super();
	}
}
