package com.varxyz.jv251.service;

import java.util.List;

import com.varxyz.jv251.dao.AccountDao;
import com.varxyz.jv251.dao.CustomerDao;
import com.varxyz.jv251.domain.CheckingAccount;
import com.varxyz.jv251.domain.Customer;
import com.varxyz.jv251.domain.SavingsAccount;
import com.varxyz.jv251.exception.CustomerNotFoundException;
import com.varxyz.jv251.exception.DuplicatedEntifyException;
import com.varxyz.jv251.exception.EntityNotFoundException;

public class BankService {
	private static final BankService service = new BankService();
	public static final char SA = 'S';
	public static final char CA = 'C';

	public static final double DEFAULT_INTEREST_RATE = 0.03;
	public static final double DEFAULT_OVERDRAFT_AMOUNT = 1000.0;
	
	private CustomerService customerService;
	private AccountService accountService;
	
	private BankService() {
		init();
	}
	
	public void init() {
		customerService = new CustomerService(new CustomerDao());
		accountService = new AccountService(new AccountDao());
	}
	
	public static BankService getInstance() {
		return service;
	}
	
	public void addCustomer(String name, String ssn, String phone, String userId, String passwd) {
		if(!isCustomer(ssn)) {
			customerService.addCustomer(customerService.createCustomer(name, ssn, phone, userId, passwd));
		}else {
			throw new DuplicatedEntifyException(ssn + " is duplicated.");
		}
		
	}
	
	public Customer getCustomerBySsn(String ssn) {
		return customerService.getCustomerBySsn(ssn);
	}
	
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	}
	
	public void addSavingsAccount(double balance, double interestRate, String ssn)
												throws CustomerNotFoundException {
		SavingsAccount account = new SavingsAccount();
		account.setAccountNum(accountService.generateAccountNum());
		account.setBalance(balance);
		account.setAccountType(BankService.SA);
		account.setInterestRate(interestRate);
		Customer customer = customerService.getCustomerBySsn(ssn);
		if (customer != null) {
			account.setCustomer(customer);
			accountService.addAcount(account);
		}else {
			throw new CustomerNotFoundException(ssn + " not found");
		}
		account.setCustomer(customer);
	}
	
	public void addCheckingAccount(double balance, double overdraftAmount, String ssn)
													throws CustomerNotFoundException {
		CheckingAccount account = new CheckingAccount();
		account.setAccountNum(accountService.generateAccountNum());
		account.setBalance(balance);
		account.setAccountType(BankService.CA);
		account.setOverdraftAmount(overdraftAmount);
		
		Customer customer = customerService.getCustomerBySsn(ssn);
		if (customer != null) {
			account.setCustomer(customer);
			accountService.addAcount(account);
		}else {
			throw new CustomerNotFoundException(ssn + " not found");
		}
		account.setCustomer(customer);
	}
	
	public boolean isCustomer(String ssn) {
		return customerService.getCustomerBySsn(ssn) == null ? false : true;
	}
}
