package com.varxyz.banking2.service;

import java.util.List;

import com.varxyz.banking2.domain.Account;

public interface AccountService {
	
	void addAccounts(Account account);
	List<Account> getAccounts(String userId);
	List<Account> getAllAccount();
	void doTransfer(double money, String withdrawAccountNum, String depositAccountNum);
	double getBalance(String accountNum);
	void doWithdraw(double money, String AccountNum);
	void doDeposit(double money, String AccountNum);
	void saveInterest(double interestRate, String AccountNum);
}
