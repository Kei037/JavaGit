package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.dao.AccountDao;
import com.varxyz.jv251.domain.Account;

public class AccountService {
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void addAcount(Account account) {
		accountDao.addAccount(account);
	}
	
	public List<Account> findAccountsBySsn(String ssn) {
		return accountDao.findAccountsBySsn(ssn);
	}
	
	public List<Account> findAllAccounts() {
		return accountDao.findAllAccounts();
	}
	/**
	 * XXX-XX-XXXX 형식의 계좌번호 생성
	 * 계좌번호를 만들어주는 메소드
	 * @return
	 */
	public String generateAccountNum() {
		return null;
	}
}
