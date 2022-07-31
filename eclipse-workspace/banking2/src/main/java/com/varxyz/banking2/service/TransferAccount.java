package com.varxyz.banking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.varxyz.banking.dao.AccountDao;

public class TransferAccount implements BankService {
	
	@Autowired
	AccountDao accountDao;
	
	@Override
	@Transactional
	public boolean transfer(double amount, String withdrawAccountNum, String depositAccountNum) {
		return accountDao.doTransfer(amount, withdrawAccountNum, depositAccountNum);
	}
	
}