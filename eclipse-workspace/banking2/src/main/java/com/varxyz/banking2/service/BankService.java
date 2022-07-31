package com.varxyz.banking.service;

import java.util.List;

import com.varxyz.banking.command.AccountCommand;
import com.varxyz.banking.command.CustomerCommand;

public interface BankService {
	boolean addCustomer(CustomerCommand customerCommand);
	AccountCommand addAccount(String AccountNum, String userId);
	List<AccountCommand> getAccounts(String userId);
	boolean transfer(double amount, String withdrawAccountNum, String depositAccountNum);
	boolean saveInterest(double interestRate, String AccountNum);
	AccountCommand getBalance(AccountCommand accountCommand);
}
