package com.varxyz.banking2.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCommand {
	private String email;
	private String passwd;
	private String name;
	private String ssn;
	private String phone;
}
