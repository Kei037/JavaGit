package com.varxyz.banking2.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingAccount extends Account{
	
	//이자율
	private double interestRate;
	
	@Override
	public void transfer() {
		
	}

}
