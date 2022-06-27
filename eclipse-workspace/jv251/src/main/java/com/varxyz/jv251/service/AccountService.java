package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.dao.AccountDao;
import com.varxyz.jv251.domain.Account;

public class AccountService {
	private AccountDao accountDao;
	
	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void addAccount(Account account) {
		accountDao.addAccount(account);
	}
	
	public List<Account> getfindAccountsBySsn(String ssn) {
		return accountDao.findAccountsBySsn(ssn);
	}
	
	public List<Account> getfindAllAccounts() {
		return accountDao.findAllAccounts();
	}
	
	/**
	 * XXX-XX-XXXX 형식의 계좌번호 생성
	 * 계좌번호를 만들어주는 메소드
	 * @return
	 */
	public String generateAccountNum() {
		String numStr = String.valueOf((int)(Math.random() * 1000000000));
		StringBuilder sb = new StringBuilder();
		sb.append(numStr.substring(0, 3));
		sb.append("-");
		sb.append(numStr.substring(3, 5));
		sb.append("-");
		sb.append(numStr.substring(5));
		return sb.toString();
	}
}
