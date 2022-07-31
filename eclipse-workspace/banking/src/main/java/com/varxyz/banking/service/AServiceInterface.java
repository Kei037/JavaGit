package com.varxyz.banking.service;

import java.util.List;

import com.varxyz.banking.command.AccountCommand;

public interface AServiceInterface {
	
	void addAccount(AccountCommand accountCommand);
	List<AccountCommand> getAccounts(String email);
	public void doTransfer(double money, String withdrawAccountNum, 
			String depositAccountNum);
}
