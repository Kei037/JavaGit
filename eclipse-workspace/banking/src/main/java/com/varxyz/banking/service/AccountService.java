package com.varxyz.banking.service;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.varxyz.banking.DataSourceConfig;
import com.varxyz.banking.command.AccountCommand;
import com.varxyz.banking.dao.AccountDao;
import com.varxyz.banking.dao.CustomerDao;
import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.CheckingAccount;
import com.varxyz.banking.domain.Customer;
import com.varxyz.banking.domain.SavingsAccount;

public class AccountService {
	private AccountDao accountDao;
	
	public AccountService() {
		
	}

	public AccountService(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void addAccount(AccountCommand accountCommand) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		AccountDao adao = context.getBean("accountDao", AccountDao.class);
		CustomerDao cdao = context.getBean("customerDao", CustomerDao.class);
		Customer findCustomer = cdao.findCustomerByEmail(accountCommand.getEmail());
		System.out.println(findCustomer);
		System.out.println(findCustomer.getCid());
		
	//  예금인지 저축인지 구분
		if (accountCommand.getAccountType() == 'C') {
			accountCommand = new CheckingAccount();
			accountCommand.setAccountType('C');
		}else if(accountCommand.getAccountType() == 'S') {
			accountCommand = new SavingsAccount();
			accountCommand.setAccountType('S');
		}
		accountCommand.setAccountNum("123-45-6789");
		accountCommand.setCid(findCustomer.getCid());
		adao.addAccount(accountCommand);
		context.close();
	}
	
	public List<AccountCommand> findAccountByCustomerId(String email) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DataSourceConfig.class);
		CustomerDao cdao = context.getBean("customerDao", CustomerDao.class);
		AccountDao adao = context.getBean("accountDao", AccountDao.class);
		
		Customer findCustomer =  cdao.findCustomerByEmail(email);
		return adao.findAccountByCustomerId(findCustomer.getCid());
	}
}
