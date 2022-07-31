package com.varxyz.banking2.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CheckingAccount extends Account{
	
	
	private double overAmount;

	@Override
	public void transfer() {
		
	}

}
