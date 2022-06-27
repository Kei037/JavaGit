package com.varxyz.banking.Service;

import java.util.ArrayList;
import java.util.List;
import com.varxyz.banking.domain.Customer;
import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.CheckingAccount;
import com.varxyz.banking.domain.SavingsAccount;

public class AccountServiceImpl implements AccountService {
	private static AccountService service = new AccountServiceImpl();
	private List<Account> accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	private AccountServiceImpl() {
		customerService = CustomerServiceImpl.getInstance();
	}
	
	public static AccountService getInstance() {
		return service;
	}
	
	public Account createSavingsAccount(String accountNum, double balance, double interestRate) {
		return new SavingsAccount(accountNum, balance, interestRate);
	}
	
	public Account createChekingsAccount(String accountNum, double balance, double overdraftAmount) {
		return new CheckingAccount(accountNum, balance, overdraftAmount);
	}
	/**
	 * 신규 계좌 등록
	 * @param account		계좌정보와 고객정보 전체를 캡슐화
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	/**
	 * 전달된 ssn을 통해 고객을 조회한 후 신규 계좌 등록
	 * @param account 
	 * @param ssn
	 */
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		return customer.getAccountList();
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		for(Account c : accountList) {
			if(accountNum.equals(c.getAccountNum())) {
				return c;
			}
		}
		return null;
	}

	
}
